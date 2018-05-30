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


        //ARRAYS DE VARIAS DIMENSIONES
        int[][] arrayBidimensional = new int[2][4];
        int[] array2[] = new int[2][4];
        int array2b[][] = { {0,1,2,3},{2,1,5,4} };

        System.out.println(array2b[1][2]);


        int[][][] array3d = { {{1,2},{2,4}} , {{5,4},{8,4}} };
        int[][][] array3d2= new int[2][2][2];








    }

    public static void test(Date date){
        date.getTime();
    }
}
