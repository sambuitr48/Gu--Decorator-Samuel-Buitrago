package org.example;

// DecoradorConChocolate.java
// Decorador que añade chocolate a la bebida.
public class DecoradorConChocolate extends DecoradorBebida {

    public DecoradorConChocolate(Bebida bebida) {
        super(bebida); // Se pasa la bebida a la clase base.
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", con chocolate"; // Añade "con chocolate".
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.7; // Aumenta el costo por el chocolate.
    }
}

