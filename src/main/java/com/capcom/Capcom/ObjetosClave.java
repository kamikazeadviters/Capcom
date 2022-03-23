package com.capcom.Capcom;

import com.capcom.Capcom.Characters.itemsBag;

public class ObjetosClave extends itemsBag {
    private boolean esReutilizable;

    public ObjetosClave(String nombre, int cantidad) {
        super(nombre, cantidad);
    }

    public void setEsReutilizable(boolean esReutilizable) {
        this.esReutilizable = esReutilizable;
    }

    public boolean isEsReutilizable() {
        return esReutilizable;
    }
}
