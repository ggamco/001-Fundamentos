package com.cice.ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int var = 5;
        //Scanner para poder pedir datos por consola al usuario.
        System.out.print("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();

        if (var % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }
}
