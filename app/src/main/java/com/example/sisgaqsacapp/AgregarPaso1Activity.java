package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sisgaqsacapp.R;

public class AgregarPaso1Activity extends AppCompatActivity {
    Button btnSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_paso1);
        btnSiguiente = findViewById(R.id.btn_siguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AgregarPaso1Activity.this, AgregarPaso2Activity.class);
                startActivity(i);
            }
        });
    }
}