package com.example.bouks;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


@SuppressLint("Registered")
public class baca5 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baca5);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("buku5.pdf")
                .load();
    }
}