package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class CriancasNoiteInf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criancas_noite_inf);
        PDFView pdfVew = findViewById(R.id.tacosView);
        pdfVew.fromAsset("ARCADIA HORA DE DORMIR/Filhos da noite.pdf").load();
    }
}