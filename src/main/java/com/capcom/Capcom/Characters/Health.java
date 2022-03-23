package com.capcom.Capcom.Characters;

public enum Health {
    FINE ("piola"), WARNING ("Cuidado"), DANGER ("Pa'tra");
    public String estado;

    Health(String estado) {
        this.estado = estado;

    }
}
