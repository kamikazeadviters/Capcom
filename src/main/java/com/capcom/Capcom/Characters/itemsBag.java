package com.capcom.Capcom.Characters;

public abstract class itemsBag {
private String nombreObjeto;
private int cantidadObjeto;

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public int getCantidadObjeto() {
        return cantidadObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public itemsBag(String nombre, int cantidad)
    {
        setCantidadObjeto(cantidad);
        setNombreObjeto(nombre);
    }

    public void setCantidadObjeto(int cantidadObjeto) {
        this.cantidadObjeto = cantidadObjeto;
    }
}