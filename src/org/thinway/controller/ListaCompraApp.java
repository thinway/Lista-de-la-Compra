package org.thinway.controller;

import org.thinway.model.Articulo;
import org.thinway.model.ListaCompra;

import java.util.Scanner;

/**
 * Created by thinway on 8/4/17.
 */
public class ListaCompraApp {

    private ListaCompra listaCompra;

    public ListaCompraApp() {
        listaCompra = new ListaCompra();
    }

    public void startApp(){
        int opcion;

        while ( ( opcion = showMenu() ) != 0){
            switch ( opcion ) {
                case 1:
                    listaCompra.addArticulo( leerArticulo() );
                    break;
                case 2:
                    listaCompra.borrarArticulo( leerIndice() );
            }
        }
    }

    private void leerIndice() {
        Scanner scanner = new Scanner(System.in);
        int index;

        System.out.println("Introducir índice");
    }

    private Articulo leerArticulo() {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double precio;

        System.out.println("Introduzca el nombre del artículo:");
        nombre = scanner.nextLine();
        System.out.println("Precio del artículo: ");
        precio = scanner.nextDouble();

        return new Articulo(nombre, precio);
    }

    public int showMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("**********************************");
        System.out.println("* 1 - Añadir arículo             *");
        System.out.println("* 2 - Eliminar artículo          *");
        System.out.println("* 3 - Mostrar lista de artículos *");
        System.out.println("* 4 - Consultar importe          *");
        System.out.println("* 0 - Pagar                      *");
        System.out.println("**********************************");
        System.out.println("Opción: ");
        opcion = scanner.nextInt();

        return opcion;
    }
}
