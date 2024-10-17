package org.example;

// DecoradorConCrema.java
// Decorador que añade crema a la bebida.
public class DecoradorConCrema extends DecoradorBebida {

    public DecoradorConCrema(Bebida bebida) {
        super(bebida); // Se pasa la bebida a la clase base.
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", con crema"; // Añade "con crema".
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.5; // Aumenta el costo por la crema.
    }
}
