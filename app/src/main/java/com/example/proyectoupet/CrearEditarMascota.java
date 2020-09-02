package com.example.proyectoupet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CrearEditarMascota extends AppCompatActivity {

    EditText nombreMascota;
    EditText edad;
    EditText especie;
    EditText raza;
    Button crear;
    Button editar;
    Button eliminar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_editar_mascota);

        nombreMascota = findViewById(R.id.editTextNombreMascota);
        edad = findViewById(R.id.editTextEdadMascota);
        especie = findViewById(R.id.editTextEspecie);
        raza = findViewById(R.id.editTextRaza);
        crear = findViewById(R.id.buttonCrearMascota);
        editar = findViewById(R.id.buttonEditarMascota);
        eliminar = findViewById(R.id.buttonEliminarMascota);

    }
}