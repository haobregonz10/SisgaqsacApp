package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.sisgaqsacapp.Dialogs.CrearCuentaDialog;
import com.example.sisgaqsacapp.R;

import java.util.HashMap;
import java.util.Map;


public class CrearCuentaActivity extends AppCompatActivity {
    Button BtnCrear;
    Context contexto;
    EditText edTNombre;
    EditText edTCorreo;
    EditText edTContrasenaConf;
    EditText edTContrasena;
    EditText edTApellido;
    EditText edTCelular;
    boolean confirmacion;
    boolean errorEntrada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contexto=this;
        setContentView(R.layout.activity_crear_cuenta);
         BtnCrear= findViewById(R.id.btn_crear_cuenta);
        edTApellido= (EditText) findViewById(R.id.editTextApellidos);
        edTCelular= findViewById(R.id.editTextCelular);
        edTContrasena= findViewById(R.id.editTextContraseña);
        edTContrasenaConf= findViewById(R.id.editTextContraseñaConfirmacion);
        edTCorreo= findViewById(R.id.editTextCorreo);
        edTNombre= findViewById(R.id.editTextNombre);
        errorEntrada=false;

        BtnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nombre = edTNombre.getText().toString().trim();
                 String email = edTCorreo.getText().toString().trim();
                final String password = edTContrasena.getText().toString().trim();
                final String apellido = edTApellido.getText().toString().trim();
                final String celular = edTCelular.getText().toString().trim();
                final String password2 = edTContrasenaConf.getText().toString().trim();
                errorEntrada=false;
                System.out.println("-------***----- PASSWORDS: "+password2+" ___ "+password);
                if (!isEmailValid(email)){
                    Toast.makeText(getApplicationContext(),"Ingrese un email válido!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (!isPassValid(password)){
                    Toast.makeText(getApplicationContext(),"La contraseña tiene que ser mayor o igual a 8 caracteres !",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (contieneSoloLetras(password)){
                    Toast.makeText(getApplicationContext(),"La contraseña debe contenere caracteres y números !",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (!contieneSoloLetras(apellido)){
                    Toast.makeText(getApplicationContext(),"Su Apellido no puede contener números!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (!contieneSoloLetras(nombre)){
                    Toast.makeText(getApplicationContext(),"Su Nombre no puede contener números!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (isNumeric(password)){
                    Toast.makeText(getApplicationContext(),"La contraseña debe contenere caracteres y números !",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (password.equals(password2)){
                    confirmacion=true;
                    System.out.println("CONFIRMACION:   ___ "+confirmacion);
                }else{
                    confirmacion=false;
                }

                if (nombre.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Ingrese su Nombre!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (apellido.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Ingrese su Apellido!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (email.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Ingrese su Correo!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Ingrese su Contraseña!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (password2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Ingrese su confirmación de Contraseña!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (celular.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Ingrese su Celular!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if (!isCelularValid(celular)){
                    Toast.makeText(getApplicationContext(),"Ingrese un número de celular válido!",Toast.LENGTH_SHORT).show();
                    errorEntrada=true;
                }
                if(confirmacion){
                    if(errorEntrada){
                        System.out.println("ERROR ENTRADA DE DATA: .....");
                    }else{
                        ejecutarServicio("https://haobregonz.com/usuarioserenazgo.php");
                        new CrearCuentaDialog(contexto);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"No incoincide su contraseña de confirmación!",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    private void ejecutarServicio(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, response -> {

            //Toast.makeText(getApplicationContext(), "Se registró correctamente", Toast.LENGTH_SHORT).show();

        }, error -> Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show()){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros = new HashMap<String, String>();
                final String email = edTCorreo.getText().toString().trim();
                final String contraseña = edTContrasena.getText().toString().trim();
                final String nombre = edTNombre.getText().toString().trim();
                final String  apellido = edTApellido.getText().toString().trim();
                final String celular = edTCelular.getText().toString().trim();
                parametros.put("Correo",email);
                parametros.put("Contrasena",contraseña);
                parametros.put("Nombre",nombre);
                parametros.put("Apellido",apellido);
                parametros.put("Celular",celular);

                return parametros;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }


    public boolean isEmailValid(String email1) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email1).matches();
    }
    public boolean isPassValid(String pass) {
        int cantString = pass.length();
        boolean devol;
        System.out.println("Cantidad de Caracteres : "+cantString);
        if(cantString>=8){
            devol=true;
        }else{
            devol= false;
        }
        return devol;
    }

    public static boolean contieneSoloLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    public boolean isCelularValid(String pass) {
        int cantString = pass.length();
        boolean devol;
        System.out.println("Cantidad de Caracteres : "+cantString);
        if(cantString==9 && pass.startsWith("9")){
            devol=true;
        }else{
            devol= false;
        }
        return devol;
    }


}