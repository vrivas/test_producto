package es.vrivas.dagil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests para la clase ProductoTest
 */
public class ProductoTest {
    @Test
    public void ConstructorPorDefecto() {
        new Producto();
    }

    @Test
    public void ConstructorParametrizado() {
        // Compruebo que se ejecuta el contructor.
        new Producto("Camiseta", 23.50);

        // Compruebo que se asignan los datos indicados.
        assertEquals("Camiseta", (new Producto("Camiseta", 23.50)).getNombre());
        assertEquals(23.50, (new Producto("Camiseta", 23.50)).getPrecio());

    }
}
