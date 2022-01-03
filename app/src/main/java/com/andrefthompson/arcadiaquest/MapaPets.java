package com.andrefthompson.arcadiaquest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MapaPets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_pets);

        PDFView pdfVew = findViewById(R.id.arenaview);
        ImageButton bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA PETS/ENTRE NOS JARDIS MAGICOS.pdf").load(); }});
        ImageButton bt2 = findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA PETS/RASTREANDO O COELHO.pdf").load();}});
        ImageButton bt3 = findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA PETS/SIGA A ESTRADA ESCURA.pdf").load(); }});
        ImageButton bt4 = findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA PETS/A CABANA NA FLORESTA.pdf").load(); }});
        ImageButton bt5 = findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA PETS/OS ANIMAIS ENJAULADOS.pdf").load(); }});
        ImageButton bt6 = findViewById(R.id.bt6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfVew.setVisibility(View.VISIBLE);
                pdfVew.fromAsset("ARCADIA PETS/VINGANÇA DA BRUXA.pdf").load(); }});
    }
}