package com.example.sisgaqsacapp.entidades;

public class Distritos {
    private int id;
    private String nombreDistritos;
    private int idProvincias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDistritos() {
        return nombreDistritos;
    }

    public void setNombreDistritos(String nombreDistritos) {
        this.nombreDistritos = nombreDistritos;
    }

    public int getIdProvincias() {
        return idProvincias;
    }

    public void setIdProvincias(int idProvincias) {
        this.idProvincias = idProvincias;
    }

    public  String  toString(){
        return  nombreDistritos;
    }
}
