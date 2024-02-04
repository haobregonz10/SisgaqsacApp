package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sisgaqsacapp.R;

public class ResultadosPlacaActivity extends AppCompatActivity {

    Button btn_procederreportePlaca;
    TextView TVDni3;
    TextView TVLicencia3;
    TextView TVFEmision3;
    TextView TVFVencimiento3;
    TextView TVEstado3;
    TextView TVNombres3;
    TextView TVApellidos3;
    TextView TVPlaca3;
    TextView TVEmpresa3;
    TextView TVEstadoLic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_placa);
        btn_procederreportePlaca= (Button) findViewById(R.id.btn_generarReportePlaca);

        String valorDNI = getIntent().getExtras().getString("PDni");
        String valorNombre= getIntent().getExtras().getString("PNombre");
        String valorApellido = getIntent().getExtras().getString("PApellido");
        String valorPlaca = getIntent().getExtras().getString("PPlaca");
        String valorLicencia = getIntent().getExtras().getString("PLicencia");
        String valorEstado = getIntent().getExtras().getString("PEstado");
        String valorFEmision = getIntent().getExtras().getString("PFEmision");
        String valorFVencimiento = getIntent().getExtras().getString("PFVencimiento");
        String valorEmpresa = getIntent().getExtras().getString("PEmpresa");
        String valorEstadoLic = getIntent().getExtras().getString("PEstadoLic");
        System.out.println("valorDNI: "+valorDNI);
        System.out.println("valorNombre: "+valorNombre);
        System.out.println("valorApellido: "+valorApellido);
        System.out.println("valorPlaca: "+valorPlaca);
        System.out.println("valorLicencia: "+valorLicencia);
        System.out.println("valorEstado: "+valorEstado);
        System.out.println("valorFEmision: "+valorFEmision);
        System.out.println("valorFVencimiento: "+valorFVencimiento);
        System.out.println("valorEmpresa: "+valorEmpresa);
        System.out.println("valorEstadoLic: "+valorEstadoLic);

        TVDni3= findViewById(R.id.TVPDni);
        TVLicencia3= findViewById(R.id.TVPLicencia);
        TVFEmision3= findViewById(R.id.TVPFEmision);
        TVFVencimiento3= findViewById(R.id.TVPFVencimiento);
        TVEstado3= findViewById(R.id.TVPEstado);
        TVNombres3= findViewById(R.id.TVPNombres);
        TVApellidos3= findViewById(R.id.TVPApellidos);
        TVPlaca3= findViewById(R.id.TVPPlaca);
        TVEmpresa3= findViewById(R.id.TVPEmpresa);
        TVEstadoLic3= findViewById(R.id.TVPEstadoLic);

        TVDni3.setText(valorDNI);
        TVLicencia3.setText(valorLicencia);
        TVFEmision3.setText(valorFEmision);
        TVFVencimiento3.setText(valorFVencimiento);
        TVEstado3.setText(valorEstado);
        TVNombres3.setText(valorNombre);
        TVApellidos3.setText(valorApellido);
        TVPlaca3.setText(valorPlaca);
        TVEmpresa3.setText(valorEmpresa);
        TVEstadoLic3.setText(valorEstadoLic);
        if(TVEstadoLic3.getText().toString().equals("Vigente")){
            System.out.println("REDDD");
            TVEstadoLic3.setTextColor(Color.GREEN);
        }else{
            TVEstadoLic3.setTextColor(Color.RED);
        }
        if(TVEstado3.getText().toString().equals("Vigente")){
            TVEstado3.setTextColor(Color.GREEN);
        }else{
            TVEstado3.setTextColor(Color.RED);
        }


        btn_procederreportePlaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultadosPlacaActivity.this, ReporteActivity.class);
                intent.putExtra("RTDDni", valorDNI);
                intent.putExtra("RTDPlaca", valorPlaca);
                startActivity(intent);

            }
        });
    }
}