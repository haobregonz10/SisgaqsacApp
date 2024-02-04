package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sisgaqsacapp.R;

public class ResutadosDniActivity extends AppCompatActivity {
    Button btn_procederreporteDNI ;
    TextView TVDni1;
    TextView TVLicencia1;
    TextView TVFEmision1;
    TextView TVFVencimiento1;
    TextView TVEstado1;
    TextView TVNombres1;
    TextView TVApellidos1;
    TextView TVPlaca1;
    TextView TVEmpresa1;
    TextView TVEstadoLic1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resutados_dni);
        btn_procederreporteDNI= (Button) findViewById(R.id.btn_generarReporteDNI);
        String valorDNI = getIntent().getExtras().getString("IDni");
        String valorNombre= getIntent().getExtras().getString("INombre");
        String valorApellido = getIntent().getExtras().getString("IApellido");
        String valorPlaca = getIntent().getExtras().getString("IPlaca");
        String valorLicencia = getIntent().getExtras().getString("ILicencia");
        String valorEstado = getIntent().getExtras().getString("IEstado");
        String valorFEmision = getIntent().getExtras().getString("IFEmision");
        String valorFVencimiento = getIntent().getExtras().getString("IFVencimiento");
        String valorEmpresa = getIntent().getExtras().getString("IEmpresa");
        String valorEstadoLic = getIntent().getExtras().getString("IEstadoLic");
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

        TVDni1= findViewById(R.id.TVDni);
        TVLicencia1= findViewById(R.id.TVLicencia);
        TVFEmision1= findViewById(R.id.TVFEmision);
        TVFVencimiento1= findViewById(R.id.TVFVencimiento);
        TVEstado1= findViewById(R.id.TVEstado);
        TVNombres1= findViewById(R.id.TVNombres);
        TVApellidos1= findViewById(R.id.TVApellidos);
        TVPlaca1= findViewById(R.id.TVPlaca);
        TVEmpresa1= findViewById(R.id.TVEmpresa);
        TVEstadoLic1= findViewById(R.id.TVEstadoLic);

        TVDni1.setText(valorDNI);
        TVLicencia1.setText(valorLicencia);
        TVFEmision1.setText(valorFEmision);
        TVFVencimiento1.setText(valorFVencimiento);
        TVEstado1.setText(valorEstado);
        TVNombres1.setText(valorNombre);
        TVApellidos1.setText(valorApellido);
        TVPlaca1.setText(valorPlaca);
        TVEmpresa1.setText(valorEmpresa);
        TVEstadoLic1.setText(valorEstadoLic);
        if(TVEstadoLic1.getText().toString().equals("Vigente")){
            System.out.println("REDDD");
            TVEstadoLic1.setTextColor(Color.GREEN);
        }else{
            TVEstadoLic1.setTextColor(Color.RED);
        }
        if(TVEstado1.getText().toString().equals("Vigente")){
            TVEstado1.setTextColor(Color.GREEN);
        }else{
            TVEstado1.setTextColor(Color.RED);
        }

        btn_procederreporteDNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResutadosDniActivity.this, ReporteActivity.class);
                intent.putExtra("RTDDni", valorDNI);
                intent.putExtra("RTDPlaca", valorPlaca);
                startActivity(intent);

            }
        });
    }
}