package com.andrefthompson.arcadiaquest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MapaBeyound extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_beyound);


        PDFView pdfVew = findViewById(R.id.arenaview);

        ImageButton btQuartel = findViewById(R.id.btQuartelMal);
        btQuartel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/quartel mal assombrado.pdf").load();
            }});
        ImageButton btAbate = findViewById(R.id.btAbatedouro);
        btAbate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/abatedouro.pdf").load();
                 }});
        ImageButton btLaboratorio = findViewById(R.id.btLaboratorioSecreto);
        btLaboratorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/laboratorio secreto.pdf").load();}});
        ImageButton btSantuarioSombrio = findViewById(R.id.btSantuarioSombrio);
        btSantuarioSombrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/santuario sombrio.pdf").load(); }});
        ImageButton btPonteCondenados = findViewById(R.id.btPonteCondenados);
        btPonteCondenados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/ponte dos condenados.pdf").load(); }});
        ImageButton btMausoleuProfano = findViewById(R.id.btMausoleuProfano);
        btMausoleuProfano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/o mausoleu.pdf").load();}});
        ImageButton btMoinhoAlmas = findViewById(R.id.btMoinhoAlmas);
        btMoinhoAlmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/moinho das almas.pdf").load();}});
        ImageButton btCriptas = findViewById(R.id.btCriptas);
        btCriptas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/cryptas.pdf").load(); }});
        ImageButton btCemiterio = findViewById(R.id.btCemiterio);
        btCemiterio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA BEYOND MAPAS/o ceminterio.pdf").load();}});
    }}