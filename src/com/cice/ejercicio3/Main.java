package com.cice.ejercicio3;

import java.util.Scanner;

public class Main {

    //     a\ns\nd\nf\2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Que hora es? ");
        int hora = sc.nextInt();
        if (hora <= 24 && hora > 0) {
            switch (hora) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    System.out.println("BUENOS DÍAS!!!");
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    System.out.println("BUENAS TARDES!!!");
                    break;
                default:
                    System.out.println("BUENAS NOCHES!!!");
            }
        } else {
            System.out.println("Te hace falta dormir más!!!");
        }
    }
}
