package com.demo.demobook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryBookActivity extends AppCompatActivity {
    ListView simpleList1;
    String countryList[] = {"Tâm Lý - Kỹ Năng Sống",
            "Cổ Tích - Thần Thoại", "Truyện Tranh", "Hồi Ký - Tuỳ Bút"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_book);

        simpleList1 = (ListView)findViewById(R.id.categoryListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, countryList);
        simpleList1.setAdapter(arrayAdapter);

        simpleList1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(CategoryBookActivity.this,CategoryDetailtActivity.class);
                intent.putExtra("category",countryList[position]);
                startActivity(intent);
            }
        });

    }
}
