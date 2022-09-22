package com.example.blindspot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class localizacao extends AppCompatActivity {

    Button menu;
    Button personas;
    Button casos;
    Button perfil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);

        personas = findViewById(R.id.btnpersona13);
        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(localizacao.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos13);
        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(localizacao.this, aventura.class);
                startActivity(intent);
            }
        });

        perfil = findViewById(R.id.btnperfil13);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(localizacao.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee13);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(localizacao.this, Menu.class);
                startActivity(intent);
            }
        });

    }

        public void enviarPatterson(View view) {
        if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(localizacao.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            ActivityCompat.requestPermissions(localizacao.this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
            ActivityCompat.requestPermissions(localizacao.this, new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, 1);
            return;
        }

        LocationManager LocManager = (LocationManager) getSystemService(localizacao.this.LOCATION_SERVICE);
        LocationListener LocListener = new classLocalizacao();

        LocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, LocListener);

        if (LocManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            String texto = "Latitude.: " + classLocalizacao.latitude + "\n" +
                            "Longitude: " + classLocalizacao.longitude + "\n";
            Toast.makeText(localizacao.this, texto, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(localizacao.this, "Requerimento negado.", Toast.LENGTH_LONG).show();
        }

        this.mostrarLocalizacaoDados(classLocalizacao.latitude, classLocalizacao.longitude);

    }

    public void mostrarLocalizacaoDados(double latitude, double longitude) {
        TextView textloc = findViewById(R.id.txtvw_loc_perm);


        textloc.setText("Patterson te hackeou, você está seguro:" + "\n" + latitude + "\n" + longitude);

    }


}


