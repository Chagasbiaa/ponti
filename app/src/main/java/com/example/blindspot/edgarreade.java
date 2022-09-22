package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class edgarreade extends AppCompatActivity {
    Button menu;
    Button personas;
    Button casos;
    Button perfil;
    Button youtube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edgarreade);

        personas = findViewById(R.id.btnpersona8);

        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(edgarreade.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos8);

        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(edgarreade.this, aventura.class);
                startActivity(intent);
            }
        });
        perfil = findViewById(R.id.btnperfil8);

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(edgarreade.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee8);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(edgarreade.this, Menu.class);
                startActivity(intent);
            }
        });

        youtube = findViewById(R.id.btnsaibamais2);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=-GQQG1Kl5dE");

            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}