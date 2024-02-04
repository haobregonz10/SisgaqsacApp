package com.example.sisgaqsacapp.DataBaseHelpers;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbDepartamentos extends  DbHelper {
    public DbDepartamentos(@Nullable Context context) {
        super(context);
    }

    public Cursor mostrarDepartamentos(){
        try{
            SQLiteDatabase bd= this.getReadableDatabase();
            Cursor filas = bd.rawQuery("SELECT * FROM "+ TABLE_DEPARTAMENTOS +"", null);
            if(filas.moveToFirst()){
                return filas;
            }else {
                return  null;
            }
        }catch (Exception ex){
            return null;

        }
    }
}
