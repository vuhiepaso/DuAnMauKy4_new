package com.example.duanmauky4.Ungdung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.duanmauky4.R;

public class MainTopBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_top_book);
        ListView listView = findViewById(R.id.listview);
        String data[]={"hiep","truyen kieu","100 d","Thoi"," huan","kha banh","dau moi","khong lam ma doi an thi ..."};
        ArrayAdapter arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);
        listView.setAdapter(arrayAdapter);
    }
}