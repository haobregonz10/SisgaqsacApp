package com.example.sisgaqsacapp.DataBaseHelpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String BASE_NOMBRE = "db_telco.db";
    private static final int BASE_VERSION = 2;
    protected static final String TABLE_DEPARTAMENTOS = "t_departamentos";
    public DbHelper(@Nullable Context context) {
        super(context,BASE_NOMBRE,null,BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+ TABLE_DEPARTAMENTOS+"("+
                "id INTEGER PRIMARY KEY NOT NULL," +
                "nombreDepartamento TEXT NOT NULL)");

        sqLiteDatabase.execSQL("INSERT INTO "+ TABLE_DEPARTAMENTOS+ "(id, nombreDepartamento) VALUES"+
                "(1,'Amazonas'),"+
                "(2,'Áncash'),"+
                "(3,'Apurímac'),"+
                "(4,'Arequipa'),"+
                "(5,'Ayacucho'),"+
                "(6,'Cajamarca'),"+
                "(7,'Callao'),"+
                "(8,'Cusco'),"+
                "(9,'Huancavelica'),"+
                "(10,'Huánuco'),"+
                "(11,'Ica'),"+
                "(12,'Junín'),"+
                "(13,'La Libertad'),"+
                "(14,'Lambayeque'),"+
                "(15,'Lima'),"+
                "(16,'Loreto'),"+
                "(17,'Madre de Dios'),"+
                "(18,'Moquegua'),"+
                "(19,'Pasco'),"+
                "(20,'Piura'),"+
                "(21,'Puno'),"+
                "(22,'San Martín'),"+
                "(23,'Tacna'),"+
                "(24,'Tumbes'),"+
                "(25,'Ucayali')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_DEPARTAMENTOS);
        onCreate(sqLiteDatabase);
    }
}
