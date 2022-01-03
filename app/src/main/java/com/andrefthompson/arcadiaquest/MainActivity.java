package com.andrefthompson.arcadiaquest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CircleImageView viewReG =findViewById(R.id.viewRegras);
        viewReG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent regras = new Intent(getApplicationContext(), RegraRiders.class);
                startActivity(regras);
            }});
        CircleImageView viewBey =findViewById(R.id.viewBeyound);
        viewBey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), MapaBeyound.class);
                startActivity(intent4);
            }});
        CircleImageView viewArc =findViewById(R.id.viewArcada);
        viewArc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), MapaArcadia.class);
                startActivity(intent4);
            }});
        CircleImageView viewInf =findViewById(R.id.viewInferno);
        viewInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), MapaInferno.class);
                startActivity(intent4);
            }});
        CircleImageView viewPet =findViewById(R.id.viewPets);
        viewPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), MapaPets.class);
                startActivity(intent4);
            }});
        CircleImageView viewRid =findViewById(R.id.viewRiders);
        viewRid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), MapaRiders.class);
                startActivity(intent4);
            }});
        CircleImageView viewExt =findViewById(R.id.viewExtra);
        viewExt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplicationContext(), TelaExtra.class);
                startActivity(intent4);
            }});
        CircleImageView viewBrg =findViewById(R.id.btBrigar);
        viewBrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplication(), R.raw.horado);
                mediaPlayer.start();
                Intent intent4 = new Intent(getApplicationContext(), RolagemDados.class);
                startActivity(intent4);
            }});
        CircleImageView viewMusica =findViewById(R.id.btMusica);
        viewMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String endereco = "https://sl.onerpm.com/2290480604";
                Uri uri = Uri.parse(endereco);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        CircleImageView viewpix =findViewById(R.id.viewPix);
        viewpix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras1 = new Intent(getApplicationContext(), Pix.class);
                startActivity(regras1);
            }});
    }
}
