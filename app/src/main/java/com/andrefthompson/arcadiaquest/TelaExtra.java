package com.andrefthompson.arcadiaquest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TelaExtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_extra);

        ImageButton btHoraSono = findViewById(R.id.btHoraSono);
        ImageButton btTacos = findViewById(R.id.btTacos);
        btTacos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tacos.class);
                startActivity(intent);
            }});
        btHoraSono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), HoradeDormir.class);
                startActivity(intent2);
            }});
        ImageButton viewEpisodico =findViewById(R.id.btModoEpsodico);
        viewEpisodico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), ModoEpisodico.class);
                startActivity(regras1);
            }});
        ImageButton viewpix2 =findViewById(R.id.btDragoes);
        viewpix2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), Pix.class);
                startActivity(regras1);
            }});
        ImageButton viewpix3 =findViewById(R.id.btFallArcadia);
        viewpix3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), Pix.class);
                startActivity(regras1);
            }});
        ImageButton viewpix4 =findViewById(R.id.btModoSolo);
        viewpix4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), Pix.class);
                startActivity(regras1);
            }});
        ImageButton viewpix5 =findViewById(R.id.btSalvar);
        viewpix5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), Pix.class);
                startActivity(regras1);
            }});
        ImageButton viewpix6 =findViewById(R.id.btBatalhaReal);
        viewpix6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), BatalhaReal.class);
                startActivity(regras1);
            }});
        ImageButton viewpix7 =findViewById(R.id.btTrabalhando);
        viewpix7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), Pix.class);
                startActivity(regras1);
            }});
    }}