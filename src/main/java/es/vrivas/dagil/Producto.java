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
     * @throws  IllegalArgumentException El nombre no puede ser la cadena vacía.
     * @throws  IllegalArgumentException El precio no puede ser negativo.
     */
    public Producto(final String nombre, final double precio) throws IllegalArgumentException {
        if (nombre == "" || nombre == null) {
            throw new IllegalArgumentException("Producto: ctor. parametrizado: Nombre no puede ser cadena vacía.");
        }
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
