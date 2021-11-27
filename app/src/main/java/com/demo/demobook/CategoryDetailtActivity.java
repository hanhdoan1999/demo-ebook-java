package com.demo.demobook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class CategoryDetailtActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_detailt);

        Intent intent = this.getIntent();
        String category= intent.getStringExtra("category");
        Book book1=new Book();
        List<Book> listold1=book1.getListData();
        List<Book> list1=book1.getListNewData(listold1,category);

         lv = (ListView) findViewById(R.id.lvDetail);
        lv.setAdapter(new BookListAdapter(this, list1));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = lv.getItemAtPosition(position);
                // Book country = (Book) o;
                String item=((Book) o).getBookName();
                if (((Book) o).getChap()==null){
                    Intent start =new Intent(getApplicationContext(),PDFOpener.class);

                    start.putExtra("pdfFileName",item);
                    startActivity(start);
                } else{
                    Intent intent =new Intent(CategoryDetailtActivity.this,ChapListActivity.class);
                    intent.putExtra("number",((Book) o).getChap());
                    startActivity(intent);
                }
            }
        });
    }
}
