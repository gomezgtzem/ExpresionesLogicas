package com.generation;

public class Main {

    //    Ejercicio 1: Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina el valor de las
//    siguientes expresiones lógicas:
//
//    a) (X && Y) || (X && Z)                 b) (X || !Y)&& (!X || Z)
//
//    c) X || Y && Z                          d) !(X || Y) && Z
//
//    e) X || Y || X && !Z && !Y              f) !X || !Y || Z && X && !Y

    public static void main(String[] args) {
        boolean X = true;
        boolean Y = false;
        boolean Z = true;

        boolean resultado = (X && Y) || (X && Z);
        System.out.println("a)" + resultado);

        resultado = (X || !Y) && (!X || Z);
        System.out.println("b)" + resultado);

        resultado = X || Y && Z;
        System.out.println("c)" + resultado);

        resultado = !(X || Y) && Z;
        System.out.println("d)" + resultado);

        resultado = X || Y || X && !Z && !Y;
        System.out.println("e)" + resultado);

        resultado = !X || !Y || Z && X && !Y;
        System.out.println("f)" + resultado);


    }
}
