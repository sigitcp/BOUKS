package com.example.bouks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class katalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.katalog);
    }

    public void b1 (View view){
        Intent intent = new Intent(this,buku1.class);
        startActivity(intent);
    }
    public void b2 (View view){
        Intent intent = new Intent(this,buku2.class);
        startActivity(intent);
    }
    public void b3 (View view){
        Intent intent = new Intent(this,buku3.class);
        startActivity(intent);
    }
    public void b4 (View view){
        Intent intent = new Intent(this,buku4.class);
        startActivity(intent);
    }
    public void b5 (View view){
        Intent intent = new Intent(this,buku5.class);
        startActivity(intent);
    }
    public void b6 (View view){
        Intent intent = new Intent(this,buku6.class);
        startActivity(intent);
    }
    public void b7 (View view){
        Intent intent = new Intent(this,buku7.class);
        startActivity(intent);
    }
    public void b8 (View view){
        Intent intent = new Intent(this,buku8.class);
        startActivity(intent);
    }
    public void b9 (View view){
        Intent intent = new Intent(this,buku9.class);
        startActivity(intent);
    }
    public void b10 (View view){
        Intent intent = new Intent(this,buku10.class);
        startActivity(intent);
    }
    public void b11 (View view){
        Intent intent = new Intent(this,buku11.class);
        startActivity(intent);
    }
    public void g1 (View view){
        Intent intent = new Intent(this,novel.class);
        startActivity(intent);
    }
    public void g2 (View view){
        Intent intent = new Intent(this,komik.class);
        startActivity(intent);
    }
    public void g3 (View view){
        Intent intent = new Intent(this,ensiklopedia.class);
        startActivity(intent);
    }
    public void g4 (View view){
        Intent intent = new Intent(this,biografi.class);
        startActivity(intent);
    }
    public void g5 (View view){
        Intent intent = new Intent(this,ilmiah.class);
        startActivity(intent);
    }
    public void g6 (View view){
        Intent intent = new Intent(this,politik.class);
        startActivity(intent);
    }
    public void g7 (View view){
        Intent intent = new Intent(this,agama.class);
        startActivity(intent);
    }
    public void g8 (View view){
        Intent intent = new Intent(this,teknologi.class);
        startActivity(intent);
    }
    public void g9 (View view){
        Intent intent = new Intent(this,geografi.class);
        startActivity(intent);
    }
    public void profil (View view){
        Intent intent = new Intent(this,profil.class);
        startActivity(intent);
    }
    public void sd (View view){
        Intent intent = new Intent(this,sd.class);
        startActivity(intent);
    }
    public void smp (View view){
        Intent intent = new Intent(this,smp.class);
        startActivity(intent);
    }
    public void sma (View view){
        Intent intent = new Intent(this,sma.class);
        startActivity(intent);
    }
}
