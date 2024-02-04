package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.example.sisgaqsacapp.R;

public class BusquedaActivity extends AppCompatActivity {
    ImageButton btnRegistrosPDV;
    ImageButton btnVisitasPDV;
    EditText ETDNI;
    EditText ETPlaca;
    EditText ETLicencia;
    String Sdni;
    String Slic;
    String Splac;
    private ProgressBar PBAppsBusqueda;
    private LinearLayout LLYFondoBusqueda;
    Context context;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
        btnRegistrosPDV = findViewById(R.id.imgbtn_registros_pdv) ;
        btnVisitasPDV = findViewById(R.id.imgbtn_visitas_pdv) ;
        Toast.makeText(BusquedaActivity.this,"¡Bienvenido!",Toast.LENGTH_SHORT).show();
        btnRegistrosPDV.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(BusquedaActivity.this, RegistroPdvActivity.class);
                startActivity(i);

            }
        });

        btnVisitasPDV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BusquedaActivity.this, VisitasActivity.class);
                startActivity(i);
            }
        });

    }




}