package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button menu;
    Button personas;
    Button casos;
    Button perfil;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

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
    }
}