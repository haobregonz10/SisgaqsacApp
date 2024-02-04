package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.sisgaqsacapp.Dialogs.ErrorIngresarDialog;
import com.example.sisgaqsacapp.R;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Context contexto;
    Button Iniciar;
    Button Registro;
    EditText edtUsuario;
    EditText edtContraseña;
    private ProgressBar PBApps;
    private LinearLayout LLYFondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contexto=this;
        PBApps= findViewById(R.id.progressBarInicio);
        LLYFondo = findViewById(R.id.LLFondoInicio);
        Iniciar= (Button) findViewById(R.id.btn_iniciar);
        //Registro= (Button) findViewById(R.id.btn_registrar);
        edtUsuario =(EditText) findViewById(R.id.editTextUsuario1);
        edtContraseña =(EditText) findViewById(R.id.editTextContraseña1);
        PBApps.setVisibility(View.INVISIBLE);
        LLYFondo.setVisibility(View.INVISIBLE);

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, BusquedaActivity.class));
                PBApps.setVisibility(View.VISIBLE);
                LLYFondo.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,"Espere...",Toast.LENGTH_SHORT).show();
                //validarUsuario("https://haobregonz.com/valuser.php");
                Intent intent = new Intent(getApplicationContext(), BusquedaActivity.class);
                startActivity(intent);
            }
        });

//        Registro.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, CrearCuentaActivity.class));
//            }
//        });
    }
     private void validarUsuario(String URL){
         StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
             @Override
             public void onResponse(String response) {
                 System.out.println("DDDDDDD: "+response);
                 if (response.equals("ingresaste correctamente")) {
                     PBApps.setVisibility(View.INVISIBLE);
                     LLYFondo.setVisibility(View.INVISIBLE);
                     Intent intent = new Intent(getApplicationContext(), BusquedaActivity.class);
                     startActivity(intent);

                 } else {
                     PBApps.setVisibility(View.INVISIBLE);
                     LLYFondo.setVisibility(View.INVISIBLE);
                     new ErrorIngresarDialog(contexto);
                     //Toast.makeText(MainActivity.this, "Usuario o Contraseña no válidos", Toast.LENGTH_SHORT).show();

                 }
             }
         }, error -> Toast.makeText(MainActivity.this,error.toString(),Toast.LENGTH_SHORT).show()){
             @Override
             protected Map<String, String> getParams() throws AuthFailureError {
                 Map<String,String> parametros= new HashMap<String,String>();
                 parametros.put("usuario",edtUsuario.getText().toString());
                 parametros.put("password",edtContraseña.getText().toString());
                 return parametros;
             }
         };
         RequestQueue requestQueue= Volley.newRequestQueue(this);
         requestQueue.add(stringRequest);

     }


}