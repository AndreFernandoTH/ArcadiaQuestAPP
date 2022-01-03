package com.andrefthompson.arcadiaquest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HoradeDormir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horade_dormir);

        ImageButton imagePortalInf = findViewById(R.id.btPortalTurbulentoInf);
        ImageButton imagePadreInf = findViewById(R.id.btMulherPadreInf);
        ImageButton imagePadre = findViewById(R.id.btMulherPadre);
        ImageButton imageNoiteLua = findViewById(R.id.btNoiteSemLua);
        ImageButton imageNoiteLuaInf = findViewById(R.id.btNoiteSemLuaInf);
        ImageButton imageCriancasNoite = findViewById(R.id.btCriancasNoite);
        ImageButton imageCriancasNoiteInf = findViewById(R.id.btCriancasNoiteInf);
        ImageButton imageNaoExAtrasos = findViewById(R.id.btNaoExisteAtraso);
        ImageButton imageNaoExAtrasosInf = findViewById(R.id.btNaoExisteAtrasoInf);
        ImageButton imagePortal = findViewById(R.id.btPortalTurbulento);
        ImageButton viewpix =findViewById(R.id.btPixDormir);

        viewpix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), Pix.class);
                startActivity(regras1);
            }});
        imagePortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PortalTurbulento.class);
                startActivity(intent);
            }});
        imagePadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), UltimoMulherPadre.class);
                startActivity(intent2);
            }});
        imageNoiteLua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), NoiteSemLua.class);
                startActivity(intent2);
            }});
        imageCriancasNoite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), CriancasNoite.class);
                startActivity(intent2);
            }});
        imageNaoExAtrasos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), NaoExisteAtrasos.class);
                startActivity(intent2);
            }});
        imagePortalInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PortalTurbulentoInf.class);
                startActivity(intent);
            }});
        imagePadreInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), MulherPadreInf.class);
                startActivity(intent2);
            }});
        imageNoiteLuaInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), NoiteSemLuaInf.class);
                startActivity(intent2);
            }});
        imageCriancasNoiteInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), CriancasNoiteInf.class);
                startActivity(intent2);
            }});
        imageNaoExAtrasosInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), NaoExisteAtrasosInf.class);
                startActivity(intent2);
            }});
    }
}