package com.cice.ejercicio5;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int resultado = 0;
        for(int auxiliar : array){
            resultado = resultado + auxiliar;
        }
        System.out.println("La suma de los valores es: " + resultado);

        //bucle convencional
        for(int i = 0; i<array.length; i++){
            int auxiliar = array[i];
            resultado = resultado + auxiliar;
        }

        //bucle foreach
        for(int auxiliar : array){
            resultado = resultado + auxiliar;
        }
    }
}
