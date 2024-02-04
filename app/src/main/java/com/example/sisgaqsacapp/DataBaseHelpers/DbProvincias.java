package com.example.sisgaqsacapp.DataBaseHelpers;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbProvincias extends  DbHelperProvincias {
    public DbProvincias(@Nullable Context context) {
        super(context);
    }

    public Cursor mostrarProvincias(int id_Departamento){
        try{
            SQLiteDatabase bd= this.getReadableDatabase();
            Cursor filas = bd.rawQuery("SELECT * FROM "+ TABLE_PROVINCIAS +" WHERE idDepartamento= "+id_Departamento + "", null);
            if(filas.moveToFirst()){
                System.out.println("LAS FILAS SON:::: "+filas.toString());
                return filas;

            }else {
                return  null;
            }
        }catch (Exception ex){
            return null;

        }
    }
}
