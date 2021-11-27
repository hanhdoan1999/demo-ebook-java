package com.demo.demobook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class IndexActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Intent intent = this.getIntent();



        Book b=new Book();
        List<Book> image_details = b.getListData();
        final ListView pdfListView = (ListView) findViewById(R.id.myPDFList);
        pdfListView.setAdapter(new BookListAdapter(this, image_details));






        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = pdfListView.getItemAtPosition(position);
               // Book country = (Book) o;
                String item=((Book) o).getBookName();
                if (((Book) o).getChap()==null){
                 Intent start =new Intent(getApplicationContext(),PDFOpener.class);

                start.putExtra("pdfFileName",item);
                startActivity(start);
                } else{
                    Intent intent =new Intent(IndexActivity.this,ChapListActivity.class);
                    intent.putExtra("number",((Book) o).getChap());
                    startActivity(intent);
                }


            }
        });


    }

   //------------
}
