package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class BatalhaReal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batalha_real);
        PDFView viewBR = findViewById(R.id.viewBatalhaReal);
        viewBR.fromAsset("batalha real.pdf").load();
    }
}