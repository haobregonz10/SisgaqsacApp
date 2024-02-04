package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sisgaqsacapp.R;

public class ResultadosLicenciaActivity extends AppCompatActivity {
    Button btn_procederreporteLicencia ;
    Button btn_procederreporteDNI ;
    TextView TVDni2;
    TextView TVLicencia2;
    TextView TVFEmision2;
    TextView TVFVencimiento2;
    TextView TVEstado2;
    TextView TVNombres2;
    TextView TVApellidos2;
    TextView TVPlaca2;
    TextView TVEmpresa2;
    TextView TVEstadoLic2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_licencia);
        btn_procederreporteLicencia= (Button) findViewById(R.id.btn_generarReportelicencia);
        String valorDNI = getIntent().getExtras().getString("LDni");
        String valorNombre= getIntent().getExtras().getString("LNombre");
        String valorApellido = getIntent().getExtras().getString("LApellido");
        String valorPlaca = getIntent().getExtras().getString("LPlaca");
        String valorLicencia = getIntent().getExtras().getString("LLicencia");
        String valorEstado = getIntent().getExtras().getString("LEstado");
        String valorFEmision = getIntent().getExtras().getString("LFEmision");
        String valorFVencimiento = getIntent().getExtras().getString("LFVencimiento");
        String valorEmpresa = getIntent().getExtras().getString("LEmpresa");
        String valorEstadoLic = getIntent().getExtras().getString("LEstadoLic");
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

        TVDni2= findViewById(R.id.TVLDni);
        TVLicencia2= findViewById(R.id.TVLLicencia);
        TVFEmision2= findViewById(R.id.TVLFEmision);
        TVFVencimiento2= findViewById(R.id.TVLFVencimiento);
        TVEstado2= findViewById(R.id.TVLEstado);
        TVNombres2= findViewById(R.id.TVLNombres);
        TVApellidos2= findViewById(R.id.TVLApellidos);
        TVPlaca2= findViewById(R.id.TVLPlaca);
        TVEmpresa2= findViewById(R.id.TVLEmpresa);
        TVEstadoLic2= findViewById(R.id.TVLEstadoLic);

        TVDni2.setText(valorDNI);
        TVLicencia2.setText(valorLicencia);
        TVFEmision2.setText(valorFEmision);
        TVFVencimiento2.setText(valorFVencimiento);
        TVEstado2.setText(valorEstado);
        TVNombres2.setText(valorNombre);
        TVApellidos2.setText(valorApellido);
        TVPlaca2.setText(valorPlaca);
        TVEmpresa2.setText(valorEmpresa);
        TVEstadoLic2.setText(valorEstadoLic);
        if(TVEstadoLic2.getText().toString().equals("Vigente")){
            System.out.println("REDDD");
            TVEstadoLic2.setTextColor(Color.GREEN);
        }else{
            TVEstadoLic2.setTextColor(Color.RED);
        }
        if(TVEstado2.getText().toString().equals("Vigente")){
            TVEstado2.setTextColor(Color.GREEN);
        }else{
            TVEstado2.setTextColor(Color.RED);
        }

        btn_procederreporteLicencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultadosLicenciaActivity.this, ReporteActivity.class);
                intent.putExtra("RTDDni", valorDNI);
                intent.putExtra("RTDPlaca", valorPlaca);
                startActivity(intent);
            }
        });
    }
}