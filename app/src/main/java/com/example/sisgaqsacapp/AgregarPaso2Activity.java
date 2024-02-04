package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sisgaqsacapp.R;

public class AgregarPaso2Activity extends AppCompatActivity {
    Button btnFinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_paso2);
        btnFinalizar = findViewById(R.id.btn_finalizar);
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AgregarPaso2Activity.this, RegistroPdvActivity.class);
                startActivity(i);
            }
        });
    }
}