package org.example;

// DecoradorBebida.java
// Clase abstracta que implementa Bebida y referencia una bebida existente.
public abstract class DecoradorBebida implements Bebida {
    protected Bebida bebida; // Referencia al componente que se está decorando.

    public DecoradorBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion(); // Delegamos la descripción.
    }

    @Override
    public double costo() {
        return bebida.costo(); // Delegamos el costo base.
    }
}

