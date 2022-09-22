package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class opcoes extends AppCompatActivity {

    Button menu;
    Button personas;
    Button casos;
    Button perfil;
    Button sensor;
    Button local;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);

        personas = findViewById(R.id.btnpersona12);
        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opcoes.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos12);
        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opcoes.this, aventura.class);
                startActivity(intent);
            }
        });

        perfil = findViewById(R.id.btnperfil12);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opcoes.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee12);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opcoes.this, Menu.class);
                startActivity(intent);
            }
        });

        sensor = findViewById(R.id.btnsens);
        sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opcoes.this, sensor_laterna.class);
                startActivity(intent);
            }
        });

        local = findViewById(R.id.btnlocal);
        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(opcoes.this, localizacao.class);
                startActivity(intent);
            }
        });
    }

}