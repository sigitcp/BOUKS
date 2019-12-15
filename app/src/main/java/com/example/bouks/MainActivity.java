package com.example.bouks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void masuk (View view){
        Intent intent = new Intent(this,katalog.class);
        startActivity(intent);
    }
    public void regis (View view){
        Intent intent = new Intent(this,registrasi.class);
        startActivity(intent);
    }

}
