package com.praveen.jdk21.basics.operators_11;

public class Logical_Operator_Ex_11_3 {

    public static void main(String[] args) {

        /*
            Logical Operators   -   && || !
         */

        boolean c1 = true;
        boolean c2 = false;

        System.out.println(c1 + " && " + c2 + " => " + (c1 && c2));
        System.out.println(c1 + " || " + c2 + " => " + (c1 && c2));
        System.out.println("!" + c1 + " => " + !c1);

        // Short Circuiting - Second operand is not evaluated
        //                      when the first operand of the && is false
        int a = 10, b = 20;

        boolean result = (a > b) && (b++ > a);

        System.out.println("value of b : " + b);


        // De Morgan's Law
        boolean x = true;
        boolean y = false;

        // !( x && y) => !x || !y
        System.out.println( !( x && y)  + " " + ( !x || !y ) );

        // !( x || y) => !x && !y
        System.out.println( !( x || y)  + " " + ( !x && !y ) );

    }
}


