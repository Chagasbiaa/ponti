package com.example.blindspot;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class casossolucionados extends AppCompatActivity {

    Button menu;
    Button personas;
    Button casos;
    Button perfil;
    ImageView imvw_botaocard_cs;
    ImageView imvw_botaovoltar_cs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);

        imvw_botaovoltar_cs = findViewById(R.id.imvw_voltarcs);

        imvw_botaovoltar_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), aventura.class);
                startActivity(intent);

            }
        });

        imvw_botaocard_cs = findViewById(R.id.imvw_card1_cs);

        imvw_botaocard_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), examplo_cs.class);
                startActivity(intent);

            }
        });


        personas = findViewById(R.id.btnpersona6);

        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(casossolucionados.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos6);

        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(casossolucionados.this, aventura.class);
                startActivity(intent);
            }
        });
        perfil = findViewById(R.id.btnperfil6);

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(casossolucionados.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee6);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(casossolucionados.this, Menu.class);
                startActivity(intent);
            }
        });
    }
}

