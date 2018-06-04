package com.cice.fundamentos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Bucles {

    public static void main(String[] args) {

        int i = 0;

        if(true){
            i = 2;
            if(true){
                i = 3;
                int j = 2;
            }
            //j = 0;
        }

        //BUCLE FOR
        /*for(int i = 0; i < 10; i++){
            //ejecutamos codigo
            System.out.println(i);
        }*/

        for (;i < 10;i+=3) {
            System.out.println("hola");
            //i++;
        }

        int[] array = {1,2,3,4,5,6,7,8,9};

        //FOREACH
        for(int a : array) {

            System.out.println(a);


        }

        //WHILE

        while(i<10){
            System.out.println("I vale: " + i);
            i++;
        }

        System.out.println("==============");

        do{
            System.out.println("I vale: " + i++);
        } while (i < 10);

    }
}
