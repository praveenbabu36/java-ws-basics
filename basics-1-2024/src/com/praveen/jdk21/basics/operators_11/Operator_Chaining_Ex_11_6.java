package com.praveen.jdk21.basics.operators_11;

public class Operator_Chaining_Ex_11_6 {

    public static void main(String[] args) {

        /*
            Operator Chaining
         */

        // chaining Arithmetic Operators
        int result = 10 * 2 - 5 + 2 * 2;

        System.out.println(result);

        // Chaining Relational Ops using Logical Operators
        int n1 = 100;

        boolean result2 = n1 > 50 && n1 > 75;

        System.out.println(result2);

        // Arithmetic Ops Chaining with respect to Compound Operators
        int n2 = 20;

        n2 += 10 * 2;

        System.out.println(n2);


 
    }
}
