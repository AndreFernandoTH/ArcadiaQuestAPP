package com.andrefthompson.arcadiaquest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.Collections;

public class ModoEpisodico extends AppCompatActivity {


    ArrayList lista = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_episodico);

        lista.add(0, "ARCADIA BEYOND MAPAS/abatedouro.pdf");
        lista.add(1, "ARCADIA BEYOND MAPAS/cryptas.pdf");
        lista.add(2, "ARCADIA BEYOND MAPAS/laboratorio secreto.pdf");
        lista.add(3, "ARCADIA BEYOND MAPAS/moinho das almas.pdf");
        lista.add(4, "ARCADIA BEYOND MAPAS/o ceminterio.pdf");
        lista.add(5, "ARCADIA BEYOND MAPAS/o mausoleu.pdf");
        lista.add(6, "ARCADIA BEYOND MAPAS/ponte dos condenados.pdf");
        lista.add(7, "ARCADIA BEYOND MAPAS/quartel mal assombrado.pdf");
        lista.add(8, "ARCADIA BEYOND MAPAS/santuario sombrio.pdf");
        lista.add(9, "ARCADIA INFERNO MAPAS/A COZINHA DO INFERNO.pdf");
        lista.add(10, "ARCADIA INFERNO MAPAS/A FONTE INPURA.pdf");
        lista.add(11, "ARCADIA INFERNO MAPAS/ALEM DOS PORTOES DO INFERNO.pdf");
        lista.add(12, "ARCADIA INFERNO MAPAS/BARCA DOS MORTOS.pdf");
        lista.add(13, "ARCADIA INFERNO MAPAS/COMISSÃO PARLAMENTAR DO INFERNO.pdf");
        lista.add(14, "ARCADIA INFERNO MAPAS/O DESFILE.pdf");
        lista.add(15, "ARCADIA INFERNO MAPAS/O PONEI MALDITO.pdf");
        lista.add(16, "ARCADIA INFERNO MAPAS/O PRISIONEIRO.pdf");
        lista.add(17, "ARCADIA INFERNO MAPAS/O TEMPLO CAIDO.pdf");
        lista.add(18, "ARCADIA INFERNO MAPAS/PE NO TRASEIRO.pdf");
        lista.add(19, "ARCADIA INFERNO MAPAS/PERDIDOS NA ESCURIDÃO.pdf");
        lista.add(20, "ARCADIA PETS/A CABANA NA FLORESTA.pdf");
        lista.add(21, "ARCADIA PETS/ENTRE NOS JARDIS MAGICOS.pdf");
        lista.add(22, "ARCADIA PETS/OS ANIMAIS ENJAULADOS.pdf");
        lista.add(23, "ARCADIA PETS/RASTREANDO O COELHO.pdf");
        lista.add(24, "ARCADIA PETS/SIGA A ESTRADA ESCURA.pdf");
        lista.add(25, "ARCADIA PETS/VINGANÇA DA BRUXA.pdf");
        lista.add(26, "ARCADIA QUEST MAPAS/arenadosolbrilhante.pdf");
        lista.add(27, "ARCADIA QUEST MAPAS/covildosorcs.pdf");
        lista.add(28, "ARCADIA QUEST MAPAS/distritodoalquimista.pdf");
        lista.add(29, "ARCADIA QUEST MAPAS/distritodosmartelos.pdf");
        lista.add(30, "ARCADIA QUEST MAPAS/distritosempresombrio.pdf");
        lista.add(31, "ARCADIA QUEST MAPAS/otemplodoamanhecer.pdf");
        lista.add(32, "ARCADIA QUEST MAPAS/patiodauniversidade.pdf");
        lista.add(33, "ARCADIA QUEST MAPAS/portaodalua.pdf");
        lista.add(34, "ARCADIA QUEST MAPAS/pracadaauroravermelha.pdf");
        lista.add(35, "ARCADIA QUEST MAPAS/viveirodasaguias.pdf");
        lista.add(36, "ARCADIA QUEST MAPAS/amancao.pdf");
        lista.add(37, "ARCADIA RIDERS/CAÇA AO CAÇADOR.pdf");
        lista.add(38, "ARCADIA RIDERS/DESPERTAR DAS RIENAS.pdf");
        lista.add(39, "ARCADIA RIDERS/DIA DA CAÇA.pdf");
        lista.add(40, "ARCADIA RIDERS/FIM DA TEMPORADA DE CAÇA.pdf");
        lista.add(41, "ARCADIA RIDERS/FOFURA MORTAL.pdf");
        lista.add(42, "ARCADIA RIDERS/MONTODROMO DE ARCADIA.pdf");
        lista.add(43, "ARCADIA RIDERS/OSSO DURO DE ROER.pdf");
        lista.add(44, "ARCADIA RIDERS/PEQUENAS PRESAS.pdf");
        lista.add(45, "ARCADIA RIDERS/SOSSEGA RAPAZ.pdf");
        lista.add(46, "ARCADIA HORA DE DORMIR/O ultimo e a Mulher do Padre.pdf");
        lista.add(47, "ARCADIA HORA DE DORMIR/Um Portal Turbulento.pdf");
        lista.add(48, "tacos.pdf");


        Collections.shuffle(lista);
        PDFView pdfVew = findViewById(R.id.episodicoView);
        pdfVew.fromAsset(lista.get(0).toString()).load();

}
}