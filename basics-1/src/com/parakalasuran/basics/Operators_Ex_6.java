package com.parakalasuran.basics;

public class Operators_Ex_6 {

    public static void main(String[] args) {

        /*

            Operators:

            Arithmetic : + - * / % ++ --

            Relational : == != < >= <=

            Logical : && || !

            Assignment : = += -= /= %=

            Conditional : ?:



         */


        int a = 5, b = 10, c = 15, d = 20;

        //Arithmetic :

        System.out.println( "Arithmetic: " + "\n"
                                + (a + b) + "\n"
                                + (a - b) + "\n"
                                + (a / b) + "\n"
                                + (c % a) + "\n"
                        );

        // post increment
        System.out.println( a++ );

        // pre increment
        System.out.println( ++a );

        // post decrement
        System.out.println( b-- );

        // pre decrement
        System.out.println( --b );

    }

}
