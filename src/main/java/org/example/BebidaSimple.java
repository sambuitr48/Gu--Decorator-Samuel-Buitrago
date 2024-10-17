package org.example;

// BebidaSimple.java
// Implementación de una bebida básica sin decoradores.
public class BebidaSimple implements Bebida {

    @Override
    public String obtenerDescripcion() {
        return "Bebida simple"; // Descripción de la bebida base.
    }

    @Override
    public double costo() {
        return 1.0; // Costo base de la bebida simple.
    }
}

