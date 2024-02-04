package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sisgaqsacapp.R;

public class DetallePdvActivity extends AppCompatActivity {
    Button Btn_Modificar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pdv);
        Btn_Modificar = findViewById(R.id.btn_modificar);

        Btn_Modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(getApplicationContext(), ModificarPdvActivity.class);
                startActivity(intent);

            }


        });
    }

    @Override
    public void onBackPressed() {
        this.startActivity(new Intent(getApplicationContext(),ConsultarPdvActivity.class));

        return;
    }
}