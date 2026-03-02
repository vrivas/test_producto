package es.vrivas.dagil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests para la clase ProductoTest
 */
public class ProductoTest {
    @Test
    public void ConstructorPorDefecto() {
        // Compruebo que se ejecuta el constructor.
        new Producto();
        // Compruebo que se asignan los datos por defecto.
        assertEquals(null, (new Producto()).getNombre());
        assertEquals(0, (new Producto()).getPrecio());
    }

    @Test
    public void ConstructorParametrizado() {
        // Compruebo que se ejecuta el contructor.
        new Producto("Camiseta", 23.50);

        // Compruebo que se asignan los datos indicados.
        assertEquals("Camiseta", (new Producto("Camiseta", 23.50)).getNombre());
        assertEquals(23.50, (new Producto("Camiseta", 23.50)).getPrecio());

        // Compruebo que lanza las excepciones con datos incorrectos
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Producto(null, 10));
        assertEquals("Producto: ctor. parametrizado: Nombre no puede ser cadena vacía.", exception.getMessage());
    }
}
