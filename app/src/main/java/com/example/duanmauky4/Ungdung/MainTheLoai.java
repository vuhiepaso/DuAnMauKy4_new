package com.example.duanmauky4.Ungdung;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.duanmauky4.MenuUngdung.ThemNguoiDung;
import com.example.duanmauky4.MenuUngdung.ThemTheLoai;
import com.example.duanmauky4.R;

public class MainTheLoai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_the_loai);
        ListView listView = findViewById(R.id.listview);
        String data[]={"hiep","truyen kieu","100 d","Thoi"," huan","kha banh","dau moi","khong lam ma doi an thi ..."};
        ArrayAdapter arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);
        listView.setAdapter(arrayAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.them,menu);
        return true;
    }
    // menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.them){
            Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ThemTheLoai.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}