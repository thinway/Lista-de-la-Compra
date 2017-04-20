package org.thinway.model;

import java.util.ArrayList;

/**
 * Created by thinway on 8/4/17.
 */
public class ListaCompra {

    private ArrayList<Articulo> articulos;

    public ListaCompra() {
        this.articulos = new ArrayList<>();
    }

    public void addArticulo(Articulo articulo){
        if ( articulo != null ){
            articulos.add( articulo );
        }
    }

    public void borrarArticulo(int index){
        if ( correctIndex(index) ){
            articulos.remove(index);
        }
    }

    private boolean correctIndex(int index) {
        if ( index>=0 && index < articulos.size() ){
            return true;
        }else{
            return false;
        }
    }

    public double calcularTotal(){
        double total = 0.0;

        for (Articulo articulo: articulos) {
            System.out.println(articulo);
            total += articulo.getPrecio();
        }

        System.out.println();
        return total;
    }
}
