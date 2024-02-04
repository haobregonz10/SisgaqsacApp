package com.example.sisgaqsacapp.entidades;

public class Provincias {
    private int id;
    private String nombreProvincias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProvincias() {
        return nombreProvincias;
    }

    public void setNombreProvincias(String nombreProvincias) {
        this.nombreProvincias = nombreProvincias;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    private int idDepartamento;



    public  String  toString(){
        return  nombreProvincias;
    }
}
