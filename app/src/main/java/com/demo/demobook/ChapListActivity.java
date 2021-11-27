package com.demo.demobook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChapListActivity extends AppCompatActivity {
    WebView webView;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap_list);
        list=(ListView) findViewById(R.id.listChapView);

        Intent extras = getIntent();
                final String [] arrayB = extras.getStringArrayExtra("number");
                //String name = extras.getStringExtra("name");
                ArrayAdapter<String> arrayAdapter
                        = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , arrayB);
                list.setAdapter(arrayAdapter);

                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent1 =new Intent(ChapListActivity.this,DetailBookActivity.class);
                        intent1.putExtra("arrayChapSelecter",arrayB[i].toString());
                        // intent1.putExtra("arrayChap",arrayB);
                        startActivity(intent1);
                    }
                });
            }



    }


