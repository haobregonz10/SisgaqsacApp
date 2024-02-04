package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.sisgaqsacapp.R;

public class DetalleVisitasActivity extends AppCompatActivity {
    Spinner SPMeses;
    Spinner SPYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_visitas);
        SPMeses = findViewById(R.id.SPMesVisita);
        SPYear = findViewById(R.id.SPYearVisita);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SPMeses.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.planets_array2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SPYear.setAdapter(adapter2);
    }
}