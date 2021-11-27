package com.demo.demobook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    Button btnsearch;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    List<Book> listBook;
    List<Book> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.lvsearch);
        Book book2 = new Book();
        listBook = book2.getListData();


        btnsearch = (Button) findViewById(R.id.btnsearch);
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book3 = new Book();
                books = book3.searchBook(listBook, searchView.toString());
                if (books == null) {
                    Toast.makeText(SearchActivity.this, "No Match found", Toast.LENGTH_LONG).show();
                } else {
                   // listView.setAdapter(new BookListAdapter(this, books));
                }
            }
        });
    }
}

