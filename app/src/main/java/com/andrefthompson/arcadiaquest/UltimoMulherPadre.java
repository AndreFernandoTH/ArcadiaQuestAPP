package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class UltimoMulherPadre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultimo_mulher_padre);

        PDFView viewUltMuPadre = findViewById(R.id.UltMulherPadre);
        viewUltMuPadre.fromAsset("ARCADIA HORA DE DORMIR/O ultimo e a Mulher do Padre.pdf").load();
    }
}