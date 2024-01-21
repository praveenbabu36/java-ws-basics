package com.parakalasuran.basics;

public class Assignement_Types_Ex_9 {

    public static void main(String[] args) {

        // Simple Assignment

        int a1 = 100;

        System.out.println( a1 );


        // Chained Assignment

        int a2, b2, c2, d2;

        a2 = b2 = c2 = d2 = 200;

        System.out.println( a2 + " " + b2 + " " + c2 + " " + d2 );


        // Compound Assignment - Implicit Typecasting is performed.

        int a3 = 5;

        a3 += 10;

        System.out.println( a3 );


        // implicit typecasting is performed with compound assignment
        byte b4 = 10, b5 = 10;

        b4 = (byte)(b4 + 1);   // compile error without explicit typecasting

        System.out.println( b4 );

        b5 += 1;

        System.out.println( b5 );

    }

}
