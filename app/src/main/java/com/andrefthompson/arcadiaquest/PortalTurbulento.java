package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PortalTurbulento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal_turbulento);

        PDFView pdfVew = findViewById(R.id.portalTurbulentoView);
        pdfVew.fromAsset("ARCADIA HORA DE DORMIR/Um Portal Turbulento.pdf").load();
    }
}