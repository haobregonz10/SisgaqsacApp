package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sisgaqsacapp.R;

public class SinRegistrosActivity extends AppCompatActivity {
    Button btn_New_consulta;
    Button btn_reportar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_registros);
        btn_New_consulta = (Button) findViewById(R.id.btn_nueva_consulta);
        btn_reportar = (Button) findViewById(R.id.btn_reportar);
        btn_New_consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SinRegistrosActivity.this, BusquedaActivity.class));
            }
        });
        btn_reportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SinRegistrosActivity.this, ReporteVacioActivity.class));
            }
        });


    }
}