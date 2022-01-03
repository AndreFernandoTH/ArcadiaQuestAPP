package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class NaoExisteAtrasosInf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nao_existe_atrasos_inf);
        PDFView pdfVew = findViewById(R.id.tacosView);
        pdfVew.fromAsset("ARCADIA HORA DE DORMIR/Nao Existe Atrasos.pdf").load();
    }
}