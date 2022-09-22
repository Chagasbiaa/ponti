package com.example.blindspot;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class examplo_cs extends AppCompatActivity {

    ImageView imvw_btnvoltar_excs;
    Button btn_loc;
    Button menu;
    Button personas;
    Button casos;
    Button perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examplecs);

        imvw_btnvoltar_excs = findViewById(R.id.imvw_voltarexcs);
        imvw_btnvoltar_excs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), casossolucionados.class);
                startActivity(intent);

            }
        });

        Button btn_loc = findViewById(R.id.btn_loc_telaexcs);
        btn_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri loc_cs= Uri.parse("geo:0,0?q=Times+Square");
                Intent intent_loc = new Intent(Intent.ACTION_VIEW, loc_cs);
                startActivity(intent_loc);
            }
        });

        personas = findViewById(R.id.btnpersona10);
        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(examplo_cs.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos10);
        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(examplo_cs.this, aventura.class);
                startActivity(intent);
            }
        });

        perfil = findViewById(R.id.btnperfil10);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(examplo_cs.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee10);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(examplo_cs.this, Menu.class);
                startActivity(intent);
            }
        });

    }
}
