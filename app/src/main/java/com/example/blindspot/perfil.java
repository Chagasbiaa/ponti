package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perfil extends AppCompatActivity {
  Button menu;
  Button personas;
  Button casos;
  Button perfil;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_perfil);

    menu = findViewById(R.id.btnhomee3);

    menu.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(perfil.this, Menu.class);
        startActivity(intent);
      }
    });

    personas = findViewById(R.id.btnpersona3);

    personas.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(perfil.this, personas.class);
        startActivity(intent);
      }
    });
    casos = findViewById(R.id.btncasos3);

    casos.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(perfil.this, aventura.class);
        startActivity(intent);
      }
    });
  }
}