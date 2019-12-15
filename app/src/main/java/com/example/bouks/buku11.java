package com.example.bouks;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

@SuppressLint("Registered")
public class buku11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buku11);
    }
    public void r11 (View view) {
        Intent intent = new Intent(this, baca11.class);
        startActivity(intent);
    }
    public void k1(View view) {
        Toast.makeText(getApplicationContext(), "tanggapan terkirim", Toast.LENGTH_LONG).show();
    }
    public void berhasil(View view) {
        Toast.makeText(getApplicationContext(), "berhasil menambahkan", Toast.LENGTH_LONG).show();
    }

}