package com.capcom.Capcom.Characters;

public class Characters {
    private String name;
    private int age;
    private gender Gender = gender.VARON;
    private float weight;
    private float height;
    private Inventory inventario;
    public Health health = Health.FINE;

    public void setName(String name){
        this.name= name;
    };

    public String getName() {
        return name;
    }

    public Inventory getInventario() {
        return inventario;
    }

    public gender getGender() {
        return Gender;
    }

    public Characters(String name, int age, float weight, float height, Inventory inventario) {
        setName(name);
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.inventario = inventario;
    }
    public Characters(String name, int age, float weight, float height, Inventory inventario, Health health, gender Gender) {
        setName(name);
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.inventario = inventario;
        this.health = health;
        this.Gender = Gender;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Health getHealth() {
        return health;
    }
}


