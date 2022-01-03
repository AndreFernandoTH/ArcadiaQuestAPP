package com.andrefthompson.arcadiaquest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MapaInferno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_inferno);

        PDFView pdfVew = findViewById(R.id.arenaview);

        ImageButton btPortoesInferno = findViewById(R.id.btPortoesInferno);
        btPortoesInferno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/ALEM DOS PORTOES DO INFERNO.pdf").load();  }});
        ImageButton btBarcaMortos = findViewById(R.id.btBarcaMortos);
        btBarcaMortos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/BARCA DOS MORTOS.pdf").load();}});
        ImageButton btPerdidosEscuridao = findViewById(R.id.btPerdidosEscuridao);
        btPerdidosEscuridao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/PERDIDOS NA ESCURIDÃO.pdf").load();}});
        ImageButton btPrisioneiro = findViewById(R.id.btPrisioneiro);
        btPrisioneiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/O PRISIONEIRO.pdf").load();}});
        ImageButton btDesfile = findViewById(R.id.btDesfile);
        btDesfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/O DESFILE.pdf").load();}});
        ImageButton btPoneiMaldito = findViewById(R.id.btPoneiMaldito);
        btPoneiMaldito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/O PONEI MALDITO.pdf").load();}});
        ImageButton btFonteImpura = findViewById(R.id.btFonteImpura);
        btFonteImpura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/A FONTE INPURA.pdf").load();}});
        ImageButton btCozinhaInferno = findViewById(R.id.btCozinhaInferno);
        btCozinhaInferno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/A COZINHA DO INFERNO.pdf").load();}});
        ImageButton btComissaoParlamentar = findViewById(R.id.btComissaoParlamentar);
        btComissaoParlamentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/COMISSÃO PARLAMENTAR DO INFERNO.pdf").load();}});
        ImageButton btPocoAlmas = findViewById(R.id.btPocoAlmas);
        btPocoAlmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/POÇO DAS ALMAS ATORMENTADAS.pdf").load(); }});
        ImageButton btTemploCaido = findViewById(R.id.btTemploCaido);
        btTemploCaido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/O TEMPLO CAIDO.pdf").load();}});
        ImageButton btPeTraseiro = findViewById(R.id.btPeTraseiro);
        btPeTraseiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA INFERNO MAPAS/PE NO TRASEIRO.pdf").load();}});

    }}