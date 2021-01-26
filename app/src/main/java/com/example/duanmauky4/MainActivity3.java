package com.example.duanmauky4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.duanmauky4.Ungdung.MainHoaDon;
import com.example.duanmauky4.Ungdung.MainListBook;
import com.example.duanmauky4.Ungdung.MainNguoiDung;
import com.example.duanmauky4.Ungdung.MainTheLoai;
import com.example.duanmauky4.Ungdung.MainThongKe;
import com.example.duanmauky4.Ungdung.MainTopBook;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void viewNguoiDung(View view) {
        Intent intent = new Intent(this, MainNguoiDung.class);
        startActivity(intent);
    }

    public void viewListBookActivity(View view) {
        Intent intent = new Intent(this, MainListBook.class);
        startActivity(intent);
    }

    public void ViewTopSach(View view) {
        Intent intent = new Intent(this, MainTopBook.class);
        startActivity(intent);
    }

    public void viewTheLoai(View view) {
        Intent intent = new Intent(this, MainTheLoai.class);
        startActivity(intent);
    }

    public void ViewListHoaDonActivity(View view) {
        Intent intent = new Intent(this, MainHoaDon.class);
        startActivity(intent);
    }

    public void ViewThongKeActivity(View view) {
        Intent intent = new Intent(this, MainThongKe.class);
        startActivity(intent);
    }
}