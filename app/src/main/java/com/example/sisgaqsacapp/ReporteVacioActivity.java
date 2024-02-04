package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.sisgaqsacapp.Dialogs.ErrorReporteDialg;
import com.example.sisgaqsacapp.Dialogs.FinalizarReporteDialog;
import com.example.sisgaqsacapp.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ReporteVacioActivity extends AppCompatActivity {

        Button btn_finalizarReporte ;
        Context contexto;
        TextView TVSancionVar;
        EditText ETDesc;
    EditText TVPlacaRep;
    EditText TVDniRep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contexto=this;

        setContentView(R.layout.activity_reporte_vacio);
        Spinner spinner = (Spinner) findViewById(R.id.SPInfraccionV);
        TVSancionVar= findViewById(R.id.TVSancionV);
        TVPlacaRep= findViewById(R.id.TVPlacaReporteV);
        TVDniRep= findViewById(R.id.TVDniReporteV);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        btn_finalizarReporte= (Button) findViewById(R.id.btn_FinalizarReporteV);
        ETDesc = findViewById(R.id.ETDescripcionV);


        final String[] CodInfraccion = {""};
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String Infraccion = spinner.getSelectedItem().toString();
                System.out.println("+++Infraccion: "+Infraccion);

                switch (Infraccion)
                {
                    case "Sin Licencia":
                        TVSancionVar.setText(R.string.sinlicencia);
                        System.out.println("Sin Licencia");
                        CodInfraccion[0] ="M01";
                        break;
                    case "Licencia Vencida o Suspendida":
                        TVSancionVar.setText(R.string.licenciavencida);
                        System.out.println("Licencia Vencida");
                        CodInfraccion[0] ="M02";
                        break;
                    case "Licencia no corresponde al vehiculo":
                        TVSancionVar.setText(R.string.placanocorresponde);
                        System.out.println("Licencia Suspendida");
                        CodInfraccion[0] ="M03";
                        break;
                    case "Sin Permiso Municipal":
                        TVSancionVar.setText(R.string.sinpermiso);
                        System.out.println("Sin Permiso Municipal");
                        CodInfraccion[0] ="M04";
                        break;
                    case "Estacionar interrumpiendo totalmente el tránsito":
                        TVSancionVar.setText(R.string.estacionar);
                        CodInfraccion[0] ="M05";
                        System.out.println("Estacionar interrumpiendo totalmente el tránsito");
                        break;
                    case "Detenerse para cargar o descargar mercancías en zonas restringidas":
                        TVSancionVar.setText(R.string.detenerse);
                        CodInfraccion[0] ="M06";
                        System.out.println("Detenerse para cargar o descargar mercancías en zonas restringidas");
                        break;
                    case "Circular sin placa":
                        TVSancionVar.setText(R.string.sinplaca);
                        System.out.println("Circular sin placa");
                        CodInfraccion[0] ="M07";
                        break;
                    case "Conducir un vehículo sin portar el Certificado SOAT físico":
                        TVSancionVar.setText(R.string.sinsoat);
                        CodInfraccion[0] ="M08";
                        System.out.println("Conducir un vehículo sin portar el Certificado SOAT físico");
                        break;
                    case "Circular con placas ilegibles o sin iluminación":
                        TVSancionVar.setText(R.string.sinluz);
                        CodInfraccion[0] ="M09";
                        System.out.println("Circular con placas ilegibles o sin iluminación");
                        break;
                    case "Utilizar la bocina para llamar la atención en forma inncesaria":
                        TVSancionVar.setText(R.string.bocina);
                        CodInfraccion[0] ="M10";
                        System.out.println("Utilizar la bocina para llamar la atención en forma inncesaria");
                        break;
                    default:
                        System.out.println("Sin selección");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                System.out.println("Ninguna seleccion");
            }
        });
        btn_finalizarReporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CodInfr=CodInfraccion[0];
                System.out.println("11111+++: "+CodInfr);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy HH:mm", Locale.getDefault());
                Date date = new Date();
                String fecha = dateFormat.format(date);
                ejecutarServicio("https://haobregonz.com/reporte.php",CodInfr,fecha);
                new FinalizarReporteDialog(contexto);
            }

        });
    }

    private void ejecutarServicio(String URL, String codInf1, String fechaSystema){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, response -> {
            //Toast.makeText(getApplicationContext(), "Se registró correctamente", Toast.LENGTH_SHORT).show();

        }, error -> {
            Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            new ErrorReporteDialg(contexto);
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros = new HashMap<String, String>();
                final String placa = TVPlacaRep.getText().toString().trim();
                final String codinfr = codInf1;
                final String dni = TVDniRep.getText().toString().trim();
                final String  descripcion = ETDesc.getText().toString().trim();
                final String fecha = fechaSystema;

                parametros.put("Placa",placa);
                parametros.put("Dni",dni);
                parametros.put("Codinfr",codinfr);
                parametros.put("Descripcion",descripcion);
                parametros.put("Fecha",fecha);


                return parametros;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    }