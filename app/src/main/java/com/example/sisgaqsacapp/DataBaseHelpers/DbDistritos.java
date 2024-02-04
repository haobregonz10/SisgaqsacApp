package com.example.sisgaqsacapp.DataBaseHelpers;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;


public class DbDistritos extends  DbHelperDistritos {
    public DbDistritos(@Nullable Context context) {
        super(context);
    }

    public Cursor mostrarDistritos(int id_Provincia){
        try{
            SQLiteDatabase bd= this.getReadableDatabase();
            Cursor filas = bd.rawQuery("SELECT * FROM "+ TABLE_DISTRITOS +" WHERE idProvincia= "+id_Provincia + "", null);
            if(filas.moveToFirst()){
                System.out.println("LA CANTIDAD DE FILAS ES::: "+filas.getCount());
                return filas;
            }else {
                return  null;
            }
        }catch (Exception ex){
            System.out.println("LA EXCEPCION ES: "+ex);
            return null;

        }
    }
}
