package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.sisgaqsacapp.R;

public class RegistroPdvActivity extends AppCompatActivity {
    ImageButton btnConsultarPDV;
    ImageButton btnAgregarPDV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_pdv);

        btnConsultarPDV = findViewById(R.id.imgbtn_consultar_pdv) ;
        btnAgregarPDV = findViewById(R.id.imgbtn_agregar_pdv) ;
        //Toast.makeText(RegistroPdvActivity.this,"¡Bienvenido!",Toast.LENGTH_SHORT).show();
        btnConsultarPDV.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(RegistroPdvActivity.this, ConsultarPdvActivity.class);
                startActivity(i);

            }
        });

        btnAgregarPDV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistroPdvActivity.this, AgregarPaso1Activity.class);
                startActivity(i);
            }
        });


    }

    @Override
    public void onBackPressed() {
        this.startActivity(new Intent(getApplicationContext(),BusquedaActivity.class));

        return;
    }
}