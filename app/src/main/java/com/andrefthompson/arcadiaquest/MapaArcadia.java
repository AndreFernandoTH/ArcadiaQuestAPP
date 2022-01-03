package com.andrefthompson.arcadiaquest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MapaArcadia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_arcadia);

        PDFView pdfVew = findViewById(R.id.arenaview);

        ImageButton btAdSB = findViewById(R.id.btArenaDoSolBrilhante);
        btAdSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/arenadosolbrilhante.pdf").load(); }
        });
        ImageButton btPLua = findViewById(R.id.btPortaoLua);
        btPLua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/portaodalua.pdf").load(); }
        });
        ImageButton btDristritoSempre = findViewById(R.id.btDistritoSempresombrio);
        btDristritoSempre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/distritosempresombrio.pdf").load();  }
        });
        ImageButton btDistritoAlwuimista = findViewById(R.id.btDistritoAlquimista);
        btDistritoAlwuimista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/distritodoalquimista.pdf").load();  }
        });
        ImageButton btDisMartelos = findViewById(R.id.btDistritoMartelos);
        btDisMartelos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/distritodosmartelos.pdf").load(); }
        });
        ImageButton btTemploAmanhecer = findViewById(R.id.btTemploAmanhecerCrespucular);
        btTemploAmanhecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/otemplodoamanhecer.pdf").load();}
        });
        ImageButton btViveiroAguia = findViewById(R.id.btViveiroAguias);
        btViveiroAguia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/viveirodasaguias.pdf").load();}
        });
        ImageButton btPraca = findViewById(R.id.btPracaAuroraVermelha);
        btPraca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/pracadaauroravermelha.pdf").load();}
        });
        ImageButton btPatio = findViewById(R.id.btPatioUniversidade);
        btPatio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/patiodauniversidade.pdf").load(); }
        });
        ImageButton btMansao = findViewById(R.id.btMansao);
        btMansao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/amancao.pdf").load(); }
        });
        ImageButton btOrcs = findViewById(R.id.btCovilOrcs);
        btOrcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA QUEST MAPAS/covildosorcs.pdf").load(); }
        });
    }
}