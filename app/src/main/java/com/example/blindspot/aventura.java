package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aventura extends AppCompatActivity {

  Button menu;
  Button personas;
  Button casos;
  Button perfil;
  Button abertos;
  Button solucionados;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_aventura);

    personas = findViewById(R.id.btnpersona2);

    personas.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, personas.class);
        startActivity(intent);
      }
    });

    casos = findViewById(R.id.btncasos2);

    casos.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, aventura.class);
        startActivity(intent);
      }
    });
    perfil = findViewById(R.id.btnperfil2);

    perfil.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, perfil.class);
        startActivity(intent);
      }
    });

    menu = findViewById(R.id.btnhomee2);

    menu.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, Menu.class);
        startActivity(intent);
      }
    });

    abertos=findViewById(R.id.btnexploretwo);

    abertos.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, casosnaosolucionados.class);
        startActivity(intent);
      }
    });

    solucionados=findViewById(R.id.btnexploreone);

    solucionados.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(aventura.this, casossolucionados.class);
        startActivity(intent);
      }
    });
  }
}