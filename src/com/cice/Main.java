package com.cice;

/**
 *
 */
public class Main {

    private static String nombre = "Gustavo";

    /**
     * Esto es un comentario para la documentacion del javaDoc
     * @param args
     */
    public static void main(String[] args) {
        //poner un comentario en una linea

        /*
        * comentario
        * en
        * varias
        * lineas
        * */

        byte numero;
        numero = 127;
        numero = 124;

        final int CONSTANTE_NO_MUTABLE = 12;

        nombre = "Pedro";




    }

    /**
     *
     * @param nombre
     * @return
     */
    public static String saluda(String nombre){
        int dato = (1 == 2) ? 1 : 2;

        final int CONSTANTE_NO_MUTABLE = 0;
        return null;
    }

}
