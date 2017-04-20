package org.thinway.model;

/**
 * Created by thinway on 8/4/17.
 */
public class Articulo {

    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.setNombre( nombre );
        this.setPrecio( precio );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if( nombre.length() == 0 ){
            this.nombre = "Sin Nombre";
        }else{
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if( precio < 0.0 ){
            this.precio = 0.0;
        }else{
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return nombre + '/' + precio;
    }
}
