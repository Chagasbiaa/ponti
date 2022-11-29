package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    Button menu;
    Button personas;
    Button casos;
    Button perfil;
    Button btn_sensor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_sensor = findViewById(R.id.btnsensor);
        btn_sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, opcoes.class);
                startActivity(intent);
            }
        });

        personas = findViewById(R.id.btnpersona);
        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Menu.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos);
        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Menu.this, aventura.class);
                startActivity(intent);
            }
        });

        perfil = findViewById(R.id.btnperfil);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Menu.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Menu.this, Menu.class);
                startActivity(intent);
            }
        });


    }
}