package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class personas extends AppCompatActivity {


  Button menu;
  Button personas;
  Button casos;
  Button perfil;
  ImageView jane;
  ImageView edgar;
  Button elenco;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_personas);

    jane = findViewById(R.id.imvw_card1_pers);
    jane.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(personas.this, jadedoe.class);
        startActivity(intent);
      }
    });

    edgar = findViewById(R.id.imvw_card2_pers);
    edgar.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(personas.this, edgarreade.class);
        startActivity(intent);
      }
    });

    elenco = findViewById(R.id.btn_elenco_tp);
    elenco.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

          Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
          String query = "Elenco BlindSpot";
          intent.putExtra(SearchManager.QUERY, query);
          startActivity(intent);

      }
    });

    personas = findViewById(R.id.btnpersona3);
    personas.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(personas.this, personas.class);
        startActivity(intent);
      }
    });

    casos = findViewById(R.id.btncasos3);
    casos.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(personas.this, aventura.class);
        startActivity(intent);
      }
    });

    perfil = findViewById(R.id.btnperfil3);
    perfil.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(personas.this, perfil.class);
        startActivity(intent);
      }
    });

    menu = findViewById(R.id.btnhomee3);
    menu.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

        Intent intent = new Intent(personas.this, Menu.class);
        startActivity(intent);
      }
    });



  }
}