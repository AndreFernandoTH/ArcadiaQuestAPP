package com.andrefthompson.arcadiaquest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MapaRiders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_riders);

        PDFView pdfVew = findViewById(R.id.arenaview);
        ImageButton btRiders1 = findViewById(R.id.btRiders1);
        btRiders1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/DESPERTAR DAS RIENAS.pdf").load(); }});
        ImageButton btRiders2a = findViewById(R.id.btRiders2a);
        btRiders2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/SOSSEGA RAPAZ.pdf").load();}});
        ImageButton btRiders2b = findViewById(R.id.btRiders2b);
        btRiders2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/OSSO DURO DE ROER.pdf").load(); }});
        ImageButton btRiders3a = findViewById(R.id.btRiders3a);
        btRiders3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/FIM DA TEMPORADA DE CAÇA.pdf").load();}});
        ImageButton btRiders3b = findViewById(R.id.btRiders3b);
        btRiders3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/PEQUENAS PRESAS.pdf").load();}});
        ImageButton btRiders4a = findViewById(R.id.btRiders4a);
        btRiders4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/MONTODROMO DE ARCADIA.pdf").load();}});
        ImageButton btRiders4b = findViewById(R.id.btRiders4b);
        btRiders4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/FOFURA MORTAL.pdf").load(); }});
        ImageButton btRiders5 = findViewById(R.id.btRiders5);
        btRiders5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/DIA DA CAÇA.pdf").load();}});
        ImageButton btRiders6 = findViewById(R.id.btRiders6);
        btRiders6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA RIDERS/CAÇA AO CAÇADOR.pdf").load(); }});
    }
}