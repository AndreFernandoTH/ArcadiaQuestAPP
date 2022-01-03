package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Tacos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tacos);
        PDFView pdfVew = findViewById(R.id.tacosView);
        pdfVew.fromAsset("tacos.pdf").load();
    }
}