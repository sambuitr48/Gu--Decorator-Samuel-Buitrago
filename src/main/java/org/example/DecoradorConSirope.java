package org.example;

// DecoradorConSirope.java
// Decorador que añade sirope a la bebida.
public class DecoradorConSirope extends DecoradorBebida {

    public DecoradorConSirope(Bebida bebida) {
        super(bebida); // Se pasa la bebida decorada.
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", con sirope"; // Añade "con sirope".
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.6; // Aumenta el costo por el sirope.
    }
}
