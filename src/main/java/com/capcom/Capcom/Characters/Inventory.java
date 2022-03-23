package com.capcom.Capcom.Characters;


import java.util.ArrayList;

public class Inventory {
    private ArrayList<itemsBag> Items;

    public ArrayList<itemsBag> getItems() {
        return Items;
    }

    public void setItems(ArrayList<itemsBag> items) {
        Items = items;
    }

    public void showIteminfo(itemsBag Items) {
        System.out.println(
                "Nombre del objeto: " + Items.getNombreObjeto() + " cantidad:" + Items.getCantidadObjeto());

    }

    public void showInventory(itemsBag Items)
    {
        this.Items.forEach(item -> showIteminfo(Items));
    }
}




