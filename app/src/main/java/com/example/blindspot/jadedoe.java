package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jadedoe extends AppCompatActivity {
    Button menu;
    Button personas;
    Button casos;
    Button perfil;
    Button youtube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadedoe);

        personas = findViewById(R.id.btnpersona7);

        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(jadedoe.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos7);

        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(jadedoe.this, aventura.class);
                startActivity(intent);
            }
        });
        perfil = findViewById(R.id.btnperfil7);

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(jadedoe.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee7);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(jadedoe.this, Menu.class);
                startActivity(intent);
            }
        });

        youtube = findViewById(R.id.btnsaibamais);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=hww9EFofqJk&t=34s");

            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}