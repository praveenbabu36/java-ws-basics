package com.praveen.jdk21.basics.operators_11;

public class Ternary_Operator_Ex_11_5 {

    public static void main(String[] args) {

        /*
            Ternary Operator :
                boolean expression ? true expression : false expression
         */

        int n1 = 150, n2  = 300;

        int max = (n1 > n2) ? n1 : n2;

        System.out.println("value of max is : " + max);


        // Nested Ternary Operator
        int n3 = 340;

        max = (n1 > n2) ? ( n1 > n3 ? n1 : n3) : ( n2 > n3 ? n2 : n3 );

        System.out.println("value of max is : " + max);

    }
}
