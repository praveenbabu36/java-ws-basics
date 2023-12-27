package com.parakalasuran.basics;

public class Operators_Ex_6 {

    public static void main(String[] args) {

        /*

            Operators:

            Arithmetic : + - * / % ++ --

            Relational : == != < > >= <=

            Logical : && || !

            Assignment : = += -= /= %=

            Conditional : ?:



         */


        /*
            Arithmetic : + - * / % ++ --
         */

        System.out.println("---Arithmetic---");

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

        // works only with variables not with constants
        //System.out.println( ++100 );

        // nesting is not allowed
        //System.out.println( --(++a)  + " " + (b++)++);

        // not for final variable
        //final int ZZ = 100;
        //System.out.println( ZZ++ );


        /*
            Relational : == != < > >= <=
         */

        System.out.println("---Relational---");

        System.out.println(a + " = " + b + " is " + (a == b) );
        System.out.println(a + " != " + b + " is " + (a != b) );
        System.out.println(a + " < " + b + " is " + (a < b) );
        System.out.println(a + " > " + b + " is " + (a > b) );
        System.out.println(a + " >= " + b + " is " + (a >= b) );
        System.out.println(a + " <= " + b + " is " + (a <= b) );


        /*
            Logical : && || !
         */

        System.out.println("---Logical---");

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 + " && " + b2 + " is " + (b1 && b2) );
        System.out.println(b1 + " && " + b3 + " is " + (b1 && b3) );
        System.out.println(b2 + " || " + b4 + " is " + (b2 || b4) );
        System.out.println(b2 + " || " + b3 + " is " + (b2 || b3) );
        System.out.println(" ! " + b3 + " is " + !b3 );
        System.out.println(" ! " + b4 + " is " + !b4 );


        /*

            Assignment : = += -= /= %=
         */
        System.out.println("---Assignment---");

        a = 10;

        b = 2;

        System.out.println(" a = " + a + ", b = " + b );

        a += b; // a = a + b

        System.out.println(" a = " + a );

        a -= b; // a = a - b

        System.out.println(" a = " + a );

        a *= b; // a = a * b

        System.out.println(" a = " + a );

        a /= b; // a = a / b

        System.out.println(" a = " + a );

        /*

            Conditional : ?:

         */

        int max =  ( a > b ) ? a : b;

        System.out.println(" max of a and b is " + max );

    }

}
