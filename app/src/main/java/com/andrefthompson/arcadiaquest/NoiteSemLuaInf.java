package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class NoiteSemLuaInf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noite_sem_lua_inf);
        PDFView pdfVew = findViewById(R.id.tacosView);
        pdfVew.fromAsset("ARCADIA HORA DE DORMIR/Uma Noite Sem Lua.pdf").load();
    }
}