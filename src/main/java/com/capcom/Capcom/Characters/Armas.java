package com.capcom.Capcom.Characters;

public class Armas extends itemsBag {
    private int cantidad;
    private categoriaArmas categoria;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Armas(String nombre, int cantidad)
    {
        super(nombre, cantidad);
    }

    public void setCategoria(categoriaArmas categoria) {
        this.categoria = categoria;
    }

    public categoriaArmas getCategoria() {
        return categoria;
    }
}
