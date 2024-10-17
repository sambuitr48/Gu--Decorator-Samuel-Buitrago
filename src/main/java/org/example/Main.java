package org.example;

// Main.java
// Clase principal que demuestra el uso del patrón Decorator.
public class Main {
    public static void main(String[] args) {
        // Creamos una bebida simple.
        Bebida bebida = new BebidaSimple();
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadimos crema a la bebida.
        bebida = new DecoradorConCrema(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadimos chocolate a la bebida.
        bebida = new DecoradorConChocolate(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadimos sirope a la bebida.
        bebida = new DecoradorConSirope(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());
    }
}
