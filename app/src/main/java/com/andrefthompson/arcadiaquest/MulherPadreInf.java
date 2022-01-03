package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MulherPadreInf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulher_padre_inf);

        PDFView pdfVew = findViewById(R.id.mulherPadreInfView);
        pdfVew.fromAsset("ARCADIA HORA DE DORMIR/O ultimo e a Mulher do Padre.pdf").defaultPage(2).load();
    }
}