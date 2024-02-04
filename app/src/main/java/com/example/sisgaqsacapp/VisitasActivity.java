package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.example.sisgaqsacapp.R;

public class VisitasActivity extends AppCompatActivity {
    Spinner SPMeses;
    ImageButton ImgButtonVisitas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitas);
        SPMeses = findViewById(R.id.SPMeses);
        ImgButtonVisitas = findViewById(R.id.imgButtonVisitas);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SPMeses.setAdapter(adapter);
        ImgButtonVisitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DetalleVisitasActivity.class);
                startActivity(intent);
            }
        });
    }
}