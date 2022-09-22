package com.example.blindspot;


import android.content.Intent;
import android.graphics.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sensor_laterna extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor sensorManagerAproximidade;
    private SensorEventListener sensorAproximidadeListener;

    ImageView btn_voltar_sensor;
    boolean laterna_bool = false;
    CameraManager sensorManagerLaterna;
    TextView aviso_text;

    Button menu;
    Button personas;
    Button casos;
    Button perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_laterna);
        personas = findViewById(R.id.btnpersona11);
        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sensor_laterna.this, personas.class);
                startActivity(intent);
            }
        });

        casos = findViewById(R.id.btncasos11);
        casos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sensor_laterna.this, aventura.class);
                startActivity(intent);
            }
        });

        perfil = findViewById(R.id.btnperfil11);
        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sensor_laterna.this, perfil.class);
                startActivity(intent);
            }
        });

        menu = findViewById(R.id.btnhomee11);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sensor_laterna.this, Menu.class);
                startActivity(intent);
            }
        });


        btn_voltar_sensor = findViewById(R.id.imvw_voltarsensor);
        btn_voltar_sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), opcoes.class);
                startActivity(intent);
            }
        });

        aviso_text = findViewById(R.id.txtvw_aviso);
        sensorManagerLaterna = (CameraManager) getSystemService(CAMERA_SERVICE);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorManagerAproximidade = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        sensorAproximidadeListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0] < sensorManagerAproximidade.getMaximumRange()){
                    try {
                        sensorManagerLaterna.setTorchMode("0", true);
                        laterna_bool = true;
                        aviso_text.setText("Há pessoas por perto");
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        sensorManagerLaterna.setTorchMode("0", false);
                        laterna_bool = false;
                        aviso_text.setText("Não há pessoas por perto");
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };

        sensorManager.registerListener(sensorAproximidadeListener, sensorManagerAproximidade, SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    protected void  onPause(){
        super.onPause();
        sensorManager.unregisterListener(sensorAproximidadeListener);
    }

}