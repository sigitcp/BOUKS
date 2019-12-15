package com.example.bouks;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

@SuppressLint("Registered")
public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
    }
    public void bayar(View view) {
        Intent intent = new Intent(this, bayar.class);
        startActivity(intent);
    }
    public void out(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void my(View view) {
        Intent intent = new Intent(this, my.class);
        startActivity(intent);
    }

}