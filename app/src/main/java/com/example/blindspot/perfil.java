package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;

public class perfil extends AppCompatActivity {


    Button menu;
    Button personas;
    Button casos;
    Button perfil;
    Button editar;
    ImageView imvw_btnvoltar_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_perfil);

      imvw_btnvoltar_profile = findViewById(R.id.imvw_voltarprofile);
      imvw_btnvoltar_profile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          Intent intent = new Intent(getApplicationContext(), Menu.class);
          startActivity(intent);
        }
      });

      personas = findViewById(R.id.btnpersona4);
      personas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

          Intent intent = new Intent(perfil.this, personas.class);
          startActivity(intent);
        }
      });

      casos = findViewById(R.id.btncasos4);
      casos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

          Intent intent = new Intent(perfil.this, aventura.class);
          startActivity(intent);
        }
      });

      perfil = findViewById(R.id.btnperfil4);
      perfil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

          Intent intent = new Intent(perfil.this, perfil.class);
          startActivity(intent);
        }
      });

      menu = findViewById(R.id.btnhomee4);
      menu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

          Intent intent = new Intent(perfil.this, Menu.class);
          startActivity(intent);
        }
      });

      editar=findViewById(R.id.btn_editprofile);
      editar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

          Intent intent = new Intent(perfil.this, Cadastro.class);
          startActivity(intent);
        }
      });
    }
  }

