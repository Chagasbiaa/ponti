package com.example.blindspot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class casosnaosolucionados extends AppCompatActivity {

    Button menu;
    Button personas;
    Button casos;
    Button perfil;
    ImageView imvw_botaocard_cns;
    ImageView imvw_botaovoltar_cns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cns);

        imvw_botaovoltar_cns = findViewById(R.id.imvw_voltarcns);

        imvw_botaovoltar_cns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), aventura.class);
                startActivity(intent);

            }
        });


        imvw_botaocard_cns = findViewById(R.id.imvw_imgmain_cns);

        imvw_botaocard_cns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), example_cns.class);
                startActivity(intent);

            }
        });


        personas = findViewById(R.id.btnpersona5);
        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(casosnaosolucionados.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos5);

        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(casosnaosolucionados.this, aventura.class);
                startActivity(intent);
            }
        });
        perfil = findViewById(R.id.btnperfil5);

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(casosnaosolucionados.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee5);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(casosnaosolucionados.this, Menu.class);
                startActivity(intent);
            }
        });
    }
}


