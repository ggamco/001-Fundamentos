package com.cice.fundamentos;

import java.util.Date;

public class Arreglos {
    int a = 10;
    int[] numeros = new int[a];
    static int[] otrosNumeros = {1,2,3,4,5};
    int numero[] = new int[a];


    public static void main(String[] args) {

        System.out.println(otrosNumeros[4]);

        otrosNumeros[1] = 3;

        int size = otrosNumeros.length;

        System.out.println(size);

        String saludos = "hola";
        System.out.println(saludos.split("").length);

        String[] cadena = new String[5];
        cadena[0] = "h";
        cadena[1] = "o";
        cadena[2] = "l";
        cadena[3] = "a";

        System.out.println(cadena[4]);
        String caracter = cadena[4];
        System.out.println(caracter);

        caracter += "cadena";

        //Date date;
        //date.getTime();

        System.out.println("TRANQUILO GORKA----");
        System.out.println(caracter);

        System.out.println(cadena.length);


        test(null);

    }

    public static void test(Date date){
        date.getTime();
    }
}
