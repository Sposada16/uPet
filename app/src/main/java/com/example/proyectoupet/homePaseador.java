package com.example.proyectoupet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homePaseador extends AppCompatActivity {

    Button botAgendarPaseo;
    Button botSitiosInteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_paseador);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botAgendarPaseo = findViewById(R.id.boton_agPaseo);
        botSitiosInteres = findViewById(R.id.boton_sitInteres);

        botAgendarPaseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), agendarPaseo.class));
            }
        });

        botSitiosInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), mapView.class));
            }
        });
    }
}