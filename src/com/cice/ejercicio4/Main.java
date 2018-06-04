package com.cice.ejercicio4;

import java.util.Scanner;

public class Main {

    //Factorial dado un numero -> desde n * (n-1) * ... hasta 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero para calcular su factorial: ");
        int numeroDado = sc.nextInt();

        int factorial = 1;
        for(;numeroDado > 0;numeroDado--){
            factorial *= numeroDado;
        }

        System.out.println("El factorial de " + numeroDado + " es: " + factorial);

    }

}
