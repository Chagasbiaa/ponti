package com.example.blindspot;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class example_cns extends AppCompatActivity {

    ImageView imvw_btnvoltar_excns;
    Button btn_loc;
    Button menu;
    Button personas;
    Button casos;
    Button perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examplecns);

            imvw_btnvoltar_excns = findViewById(R.id.imvw_voltarexcns);
            imvw_btnvoltar_excns.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), casosnaosolucionados.class);
                startActivity(intent);
                }
            });

            Button btn_loc = findViewById(R.id.btn_loc_telaexcns);
            btn_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri loc_cs= Uri.parse("geo:0,0?q=Times+Square");
                Intent intent_loc = new Intent(Intent.ACTION_VIEW, loc_cs);
                startActivity(intent_loc);
                }
            });

            personas = findViewById(R.id.btnpersona9);
            personas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(example_cns.this, personas.class);
                    startActivity(intent);
                }
            });

            casos = findViewById(R.id.btncasos9);
            casos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(example_cns.this, aventura.class);
                    startActivity(intent);
                }
            });

            perfil = findViewById(R.id.btnperfil9);
            perfil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(example_cns.this, perfil.class);
                    startActivity(intent);
                }
            });

            menu = findViewById(R.id.btnhomee9);
            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(example_cns.this, Menu.class);
                    startActivity(intent);
                }
            });

    }
}
