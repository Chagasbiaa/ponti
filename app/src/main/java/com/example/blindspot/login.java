package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    Button crie;
    Button entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        crie=findViewById(R.id.btncrie);

        crie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Intent intent = new Intent(login.this, Cadastro.class);
                 startActivity(intent);
            }
        });

        entrar=findViewById(R.id.btnentrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(login.this, Menu.class);
                startActivity(intent);
            }
        });



    }
}