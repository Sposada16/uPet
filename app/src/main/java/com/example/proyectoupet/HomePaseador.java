package com.example.proyectoupet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePaseador extends AppCompatActivity {

    Button botAgendarPaseo;
    Button botSitiosInteres;
    Button botPerfil;
    Button botAdminMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_paseador);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botAgendarPaseo = findViewById(R.id.boton_agPaseo);
        botSitiosInteres = findViewById(R.id.boton_sitInteres);
        botPerfil = findViewById(R.id.boton_perfil);
        botAdminMascota = findViewById(R.id.boton_adminMascota);

        botAgendarPaseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), AgendarPaseo.class));
            }
        });

        botSitiosInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MapView.class));
            }
        });

        botPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), PerfilUsuario.class));
            }
        });

        botAdminMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), CrearEditarMascota.class));
            }
        });
    }
}