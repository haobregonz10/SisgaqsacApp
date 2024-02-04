package com.example.sisgaqsacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.sisgaqsacapp.DataBaseHelpers.DbDepartamentos;
import com.example.sisgaqsacapp.DataBaseHelpers.DbDistritos;
import com.example.sisgaqsacapp.DataBaseHelpers.DbProvincias;
import com.example.sisgaqsacapp.R;
import com.example.sisgaqsacapp.entidades.Departamentos;
import com.example.sisgaqsacapp.entidades.Distritos;
import com.example.sisgaqsacapp.entidades.Provincias;

import java.util.ArrayList;
import java.util.List;

public class ConsultarPdvActivity extends AppCompatActivity {
    Spinner spDepartamentos;
    Spinner spProvincias;
    Spinner spDistritos;
    ImageButton BtnDetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_pdv);
        BtnDetalle = findViewById(R.id.btn_detalle);
        spDepartamentos = findViewById(R.id.SPDepartamento);
        spProvincias = findViewById(R.id.SPProvincia);
        spDistritos = findViewById(R.id.SPDistrito);
        List<Departamentos> listaDepartamentos = llenarDepartamentos();
        ArrayAdapter<Departamentos> arrayAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,listaDepartamentos);
        spDepartamentos.setAdapter(arrayAdapter);

        spDepartamentos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int idDep =((Departamentos) parent.getSelectedItem()).getId();
                String nombreDep =((Departamentos) parent.getSelectedItem()).getNombreDepartamento();
                Toast.makeText(ConsultarPdvActivity.this, idDep + " - "+ nombreDep,Toast.LENGTH_SHORT).show();

                List<Provincias> listaProvincias = llenarProvincias(idDep);
                ArrayAdapter<Provincias> arrayAdapterProvincias = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,listaProvincias);
                spProvincias.setAdapter(arrayAdapterProvincias);

                spProvincias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        int idDep =((Provincias) parent.getSelectedItem()).getId();
                        String nombreDep =((Provincias) parent.getSelectedItem()).getNombreProvincias();
                        //Toast.makeText(ConsultarPdvActivity.this, idDep + " - "+ nombreDep,Toast.LENGTH_SHORT).show();

                        List<Distritos> listaDistritos = llenarDistritos(idDep);
                        ArrayAdapter<Distritos> arrayAdapterDistritos = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,listaDistritos);
                        spDistritos.setAdapter(arrayAdapterDistritos);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        BtnDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(getApplicationContext(), DetallePdvActivity.class);
                startActivity(intent);
            }
        });
    }
    private List<Departamentos> llenarDepartamentos(){
        List<Departamentos> listaDepartamentos = new ArrayList<>();
        DbDepartamentos dbDepartamentos = new DbDepartamentos(ConsultarPdvActivity.this);
        Cursor cursor = dbDepartamentos.mostrarDepartamentos();
        if(cursor != null){
           if(cursor.moveToFirst()){
               do{
                   Departamentos dep = new Departamentos();
                   dep.setId(cursor.getInt(cursor.getColumnIndex("id")));
                   dep.setNombreDepartamento(cursor.getString(cursor.getColumnIndex("nombreDepartamento")));
                   listaDepartamentos.add(dep);
               }while(cursor.moveToNext());
           }
        }
        dbDepartamentos.close();
        return listaDepartamentos;
    }

    private List<Provincias> llenarProvincias(int idDepa){
        List<Provincias> listaProvincias = new ArrayList<>();
        DbProvincias dbDepartamentos = new DbProvincias(ConsultarPdvActivity.this);
        Cursor cursor = dbDepartamentos.mostrarProvincias(idDepa);
        if(cursor != null){
            if(cursor.moveToFirst()){
                do{
                    Provincias dep = new Provincias();
                    dep.setId(cursor.getInt(cursor.getColumnIndex("id")));
                    dep.setIdDepartamento(cursor.getInt(cursor.getColumnIndex("idDepartamento")));
                    dep.setNombreProvincias(cursor.getString(cursor.getColumnIndex("nombreProvincias")));
                    listaProvincias.add(dep);
                }while(cursor.moveToNext());
            }
        }
        dbDepartamentos.close();
        return listaProvincias;
    }

    private List<Distritos> llenarDistritos(int idDepa){
        System.out.println("EL IDDEPA ES::: "+idDepa);
        List<Distritos> listaDistritos = new ArrayList<>();
        DbDistritos dbDepartamentos = new DbDistritos(ConsultarPdvActivity.this);
        Cursor cursor = dbDepartamentos.mostrarDistritos(idDepa);
        System.out.println(cursor.toString());
        if(cursor != null){
            if(cursor.moveToFirst()){
                do{
                    Distritos dep = new Distritos();
                    dep.setId(cursor.getInt(cursor.getColumnIndex("id")));
                    dep.setIdProvincias(cursor.getInt(cursor.getColumnIndex("idProvincia")));
                    dep.setNombreDistritos(cursor.getString(cursor.getColumnIndex("nombreDistrito")));
                    listaDistritos.add(dep);
                }while(cursor.moveToNext());
            }
        }
        dbDepartamentos.close();
        return listaDistritos;
    }

    @Override
    public void onBackPressed() {
        this.startActivity(new Intent(getApplicationContext(),RegistroPdvActivity.class));

        return;
    }

}