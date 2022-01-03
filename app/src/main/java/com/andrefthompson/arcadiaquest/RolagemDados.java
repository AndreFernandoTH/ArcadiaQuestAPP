package com.andrefthompson.arcadiaquest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class RolagemDados extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolagem_dados);

        TextView txtDados = findViewById(R.id.textDados);
        TextView txtAtqCritico = findViewById(R.id.textAtqCritico);
        TextView txtAtqLonge = findViewById(R.id.textAtqLonge);
        TextView txtAtqProximo = findViewById(R.id.textAtqProximo);
        TextView txtErroDef = findViewById(R.id.textErroDef);
        TextView txtDefesaCritico = findViewById(R.id.textDefesaCritico);
        TextView txtDefesa = findViewById(R.id.textDefesa);
        ImageView imgDef = findViewById(R.id.imgDefesa);
        ImageView imgDefErro = findViewById(R.id.imgDefesaErro);
        ImageView imgAtqPert= findViewById(R.id.imgAtqPerto);
        ImageView imgAtqLong = findViewById(R.id.imgAtqLonge);
        CircleImageView btBriga = findViewById(R.id.btBriga);
        CircleImageView btMais = findViewById(R.id.btMais);
        CircleImageView btMenos = findViewById(R.id.btMenos);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.som);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.som);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.som);


        btMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valorDados = Integer.valueOf(txtDados.getText().toString());
                int valorDadosoma = valorDados + 1;
                txtDados.setText(String.valueOf(valorDadosoma));
            }});
        btMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valorDados = Integer.valueOf(txtDados.getText().toString());
                if (valorDados > 0){
                    int valorDadosoma = valorDados - 1;
                    txtDados.setText(String.valueOf(valorDadosoma));}
            }});
        btBriga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer2.start();
                }else if(mediaPlayer2.isPlaying() && mediaPlayer.isPlaying()){
                    mediaPlayer3.start();
                }else {mediaPlayer.start();}

                txtAtqCritico.setText(String.valueOf(0));
                txtAtqLonge.setText(String.valueOf(0));
                txtAtqProximo.setText(String.valueOf(0));
                txtDefesa.setText(String.valueOf(0));
                txtDefesaCritico.setText(String.valueOf(0));
                txtErroDef.setText(String.valueOf(0));




                int valorDados = Integer.valueOf(txtDados.getText().toString());
                //Ataque
                int valorDadosAtq = valorDados;
                for (int cont = 0; cont != valorDadosAtq; cont += 1) {
                    int num = (int) (Math.random() * 6);
                    if (num <= 2) {
                        int atqProximo = Integer.valueOf(txtAtqProximo.getText().toString());
                        int soma = atqProximo + 1;
                        txtAtqProximo.setText(String.valueOf(soma));
                    } else if (num == 5) {
                        int atqCritico = Integer.valueOf(txtAtqCritico.getText().toString());
                        int soma = atqCritico + 1;
                        valorDadosAtq++;
                        txtAtqCritico.setText(String.valueOf(soma));
                    } else if (num==3 ^ num==4){
                        int atqLonge = Integer.valueOf(txtAtqLonge.getText().toString());
                        int soma = atqLonge + 1;
                        txtAtqLonge.setText(String.valueOf(soma)); }}
                //Defesa
                int valorDadosDef = valorDados;
                for (int cont = 0; cont != valorDadosDef; cont += 1) {
                    int num = (int) (Math.random() * 6);
                    if (num <= 3) {
                        int defE = Integer.valueOf(txtErroDef.getText().toString());
                        int soma = defE + 1;
                        txtErroDef.setText(String.valueOf(soma));
                    } else if (num == 5) {
                        int defesaCritico = Integer.valueOf(txtDefesaCritico.getText().toString());
                        int soma = defesaCritico + 1;
                        valorDadosDef++;
                        txtDefesaCritico.setText(String.valueOf(soma));
                    } else if (num==4){
                        int defesa = Integer.valueOf(txtDefesa.getText().toString());
                        int soma = defesa + 1;
                        txtDefesa.setText(String.valueOf(soma)); } else{}} }});
                //Rerrols
        imgDef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer2.start();
                }else if(mediaPlayer2.isPlaying() && mediaPlayer.isPlaying()){
                    mediaPlayer3.start();
                }else {mediaPlayer.start();}
                int valorDef = Integer.valueOf(txtDefesa.getText().toString());
                if (valorDef > 0){
                    int dim = valorDef - 1;
                    txtDefesa.setText(String.valueOf(dim));
                    int valornv = 1;
                    for (int cont = 0; cont != valornv; cont += 1) {
                    int num = (int) (Math.random() * 6);
                    if (num <= 3) {
                        int defesaErro = Integer.valueOf(txtErroDef.getText().toString());
                        int soma = defesaErro + 1;
                        txtErroDef.setText(String.valueOf(soma));
                    } else if (num == 5) {
                        int defesaCritico = Integer.valueOf(txtDefesaCritico.getText().toString());
                        int soma = defesaCritico + 1;
                        valornv++;
                        txtDefesaCritico.setText(String.valueOf(soma));
                    } else if (num==4){
                        int defesa = Integer.valueOf(txtDefesa.getText().toString());
                        int soma = defesa + 1;
                        txtDefesa.setText(String.valueOf(soma)); } }
                }
            }
        });
        imgDefErro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer2.start();
                }else if(mediaPlayer2.isPlaying() && mediaPlayer.isPlaying()){
                    mediaPlayer3.start();
                }else {mediaPlayer.start();}
                int valorDef = Integer.valueOf(txtErroDef.getText().toString());
                if (valorDef > 0){
                    int dim = valorDef - 1;
                    txtErroDef.setText(String.valueOf(dim));
                    int valornv2 = 1;
                    for (int cont = 0; cont != valornv2; cont += 1) {
                        int num = (int) (Math.random() * 6);
                        if (num <= 3) {
                            int defesaErro = Integer.valueOf(txtErroDef.getText().toString());
                            int soma = defesaErro + 1;
                            txtErroDef.setText(String.valueOf(soma));
                        } else if (num == 5) {
                            int defesaCritico = Integer.valueOf(txtDefesaCritico.getText().toString());
                            int soma = defesaCritico + 1;
                            valornv2++;
                            txtDefesaCritico.setText(String.valueOf(soma));
                        } else if (num==4){
                            int defesa = Integer.valueOf(txtDefesa.getText().toString());
                            int soma = defesa + 1;
                            txtDefesa.setText(String.valueOf(soma)); } }
                }
            }
        });
        imgAtqPert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer2.start();
                }else if(mediaPlayer2.isPlaying() && mediaPlayer.isPlaying()){
                    mediaPlayer3.start();
                }else {mediaPlayer.start();}
                int valorAtqP = Integer.valueOf(txtAtqProximo.getText().toString());
                if (valorAtqP > 0){
                    int dim = valorAtqP - 1;
                    txtAtqProximo.setText(String.valueOf(dim));
                    int valornv3 = 1;
                    for (int cont = 0; cont != valornv3; cont += 1) {
                        int num = (int) (Math.random() * 6);
                        if (num <= 2) {
                            int atqProximo = Integer.valueOf(txtAtqProximo.getText().toString());
                            int soma = atqProximo + 1;
                            txtAtqProximo.setText(String.valueOf(soma));
                        } else if (num == 5) {
                            int atqCritico = Integer.valueOf(txtAtqCritico.getText().toString());
                            int soma = atqCritico + 1;
                            valornv3++;
                            txtAtqCritico.setText(String.valueOf(soma));
                        } else if (num==3 ^ num==4){
                            int atqLonge = Integer.valueOf(txtAtqLonge.getText().toString());
                            int soma = atqLonge + 1;
                            txtAtqLonge.setText(String.valueOf(soma)); }}
                }
            }
        });
        imgAtqLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer2.start();
                }else if(mediaPlayer2.isPlaying() && mediaPlayer.isPlaying()){
                    mediaPlayer3.start();
                }else {mediaPlayer.start();}
                int valorAtqL = Integer.valueOf(txtAtqLonge.getText().toString());
                if (valorAtqL > 0){
                    int dim = valorAtqL - 1;
                    txtAtqLonge.setText(String.valueOf(dim));
                    int valornv4 = 1;
                    for (int cont = 0; cont != valornv4; cont += 1) {
                        int num = (int) (Math.random() * 6);
                        if (num <= 2) {
                            int atqProximo = Integer.valueOf(txtAtqProximo.getText().toString());
                            int soma = atqProximo + 1;
                            txtAtqProximo.setText(String.valueOf(soma));
                        } else if (num == 5) {
                            int atqCritico = Integer.valueOf(txtAtqCritico.getText().toString());
                            int soma = atqCritico + 1;
                            valornv4++;
                            txtAtqCritico.setText(String.valueOf(soma));
                        } else if (num==3 ^ num==4){
                            int atqLonge = Integer.valueOf(txtAtqLonge.getText().toString());
                            int soma = atqLonge + 1;
                            txtAtqLonge.setText(String.valueOf(soma)); }}
                }
            }
        });
                //Funcionamento
        CircleImageView viewReG =findViewById(R.id.viewSecreto);
        viewReG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regras = new Intent(getApplicationContext(), RegrasRolagens.class);
                startActivity(regras);
            }});
    }}