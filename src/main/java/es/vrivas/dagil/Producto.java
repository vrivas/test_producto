package es.vrivas.dagil;

/**
 * Descripción de la clase producto.
 * @author Victor Rivas <vrivas@ujaen.es>
*/
public class Producto {

    /**
     * Constructor parametrizado.
     * @param nombre Nombre del nuevo artículo.
     * @param precio Precio del nuevo artículo
     * @pre El nombre no puede ser la cadena vacía.
     * @pre El precio no puede ser negativo.
     */
    public Producto(final String nombre, final float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
