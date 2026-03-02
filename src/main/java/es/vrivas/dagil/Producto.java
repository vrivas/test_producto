package es.vrivas.dagil;

/**
 * Descripción de la clase producto.
 * @author Victor Rivas <vrivas@ujaen.es>
*/
public class Producto {

    String nombre; ///<Nombre del producto.
    double precio; ///<Precio del producto.

    /**
     * Constructor por defecto.
     */
    public Producto() {
    }

    /**
     * Constructor parametrizado.
     * @param nombre Nombre del nuevo artículo.
     * @param precio Precio del nuevo artículo
     * @pre El nombre no puede ser la cadena vacía.
     * @pre El precio no puede ser negativo.
     */
    public Producto(final String nombre, final double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Devuelve el valor de la propiedad nombre.
     */
    final public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el valor de la propiedad precio.
     */
    final public double getPrecio() {
        return precio;
    }

}
