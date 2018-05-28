package com.cice.fundamentos;

public class Operadores {

    //Operadores de relación -> >; <; >=; <=; !=; ==;
    //Su finalidad es la de relacionar 2 objetos o variables para conseguir una respuesta true o false

    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 1;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;

    //Operadores lógicos && &; || |; !; ^

    public static void main (String... args) {

        System.out.println("OPERADORES DE RELACION");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("OPERADORES LOGICOS");
        System.out.println( (r1 || r2) );
        System.out.println( (r2 && r3) );
        System.out.println( (!r4) );
        System.out.println( (r5 ^ r4) );

        //OPERADOR UNARIO
        System.out.println("OPERADORES UNARIOS");
        int a = ~127;
        System.out.println(a);

        //OPERADORES DE ASIGNACION
        System.out.println("OPERADORES DE ASIGNACION");
        int b = 5;
        //b++; // b = b+1
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b);
        b--; // b = b-1
        --b;
        System.out.println(b);
        b*=2; // b = b*2
        System.out.println(b);
        b/=5; // b = b/5
        System.out.println(b);

        b+=3;
        System.out.println(b);

        b%=5;
        System.out.println(b);

        b=-10;
        //b<<=1; // desplazamiento de binarios 7 -> 111 -> 111(+0) -> 1110 -> en decimal = 14
        //b>>=1; // desplazamiento de binarios 7 -> 111 -> (0+)11(-1) -> 011 -> en decimal = 3
        b>>>=1;//
        System.out.println(b);
    }

}
