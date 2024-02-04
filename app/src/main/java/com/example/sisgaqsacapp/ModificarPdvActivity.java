package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sisgaqsacapp.Dialogs.CambiosDialog;
import com.example.sisgaqsacapp.R;

public class ModificarPdvActivity extends AppCompatActivity {
    Button BtnModificar;
    EditText etReferencia;
    EditText etAvenida;
    EditText etN;
    EditText etNombre;
    EditText etApellidos;
    EditText etDni;
    EditText etCelular;
    EditText etFecha;
    EditText etRazonSocial;
    EditText etDepartamento;
    EditText etProvincia;

    Context contexto = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_pdv);
        BtnModificar = findViewById(R.id.btn_guardar_cambios);
        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etDni = findViewById(R.id.etDni);
        etCelular = findViewById(R.id.etCelular);
        etFecha = findViewById(R.id.etFecha);
        etRazonSocial = findViewById(R.id.etRazonSocial);
        etDepartamento = findViewById(R.id.etDepartamento);
        etN = findViewById(R.id.etN);
        etAvenida = findViewById(R.id.etAvenida);
        etProvincia = findViewById(R.id.etProvincia);
        etReferencia = findViewById(R.id.etReferencia);

        etReferencia.setText("A 1/2 cuadra de la mina");

         etAvenida.setText("Menorca");
         etN.setText("12");
         etNombre.setText("DEYSI EVELING");
         etApellidos.setText("ALIAGA PIO");
         etDni.setText("72698445");
         etCelular.setText("936615784");
         etFecha.setText("18/03/1998");
         etRazonSocial.setText("Hermanos Aliaga");
         etDepartamento.setText("Lima");
         etProvincia.setText("Cañete");

        BtnModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new CambiosDialog(contexto);

            }
        });

    }
}