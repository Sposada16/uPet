package com.example.proyectoupet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaMascotas extends AppCompatActivity {

    String[] arreglo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascotas);
        initArray();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arreglo);
        ListView listView = (ListView) findViewById(R.id.listaMascotas);
        listView.setAdapter(adapter);
    }
    private void initArray() {
        arreglo = new String[30];
        for (int i = 0; i < arreglo.length; i++)
            if (i % 2 == 0)
                arreglo[i] = "hola";
            else
                arreglo[i] = "mundo";
    }

}