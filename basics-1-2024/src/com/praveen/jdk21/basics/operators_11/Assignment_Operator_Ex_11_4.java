package com.praveen.jdk21.basics.operators_11;

public class Assignment_Operator_Ex_11_4 {

    public static void main(String[] args) {

        /*
            Assignment Operators - = += -= *= /= %=
         */

        int n1 = 5;

        System.out.println("Value of n1 : " + n1);

        n1 += 10; // n1 = n1 + 10

        System.out.println("Value of n1 : " + n1);

        n1 -= 2; // n1 = n1 - 3

        System.out.println("Value of n1 : " + n1);

        n1 %= 3; // n1 => reminder of n1 / 3

        System.out.println("Value of n1 : " + n1);


        /*
            Assignment Types
         */

        // Simple Types
        int n2 = 20;
        float n3 = 5.67f;

        // Chained Assignment
        int n4, n5, n6, n7;

        n4 = n5 = n6 = n7 = 250;

        System.out.println(n4 + " " + n5 + " " + n6 + " " + n7);


        // Compound Assignment
        int n8 = 100;

        n8 += 20;

        System.out.println(n8);


        byte n9 = 10;

        n9 = (byte) (n9 + 5);   //  will throw error without type casting

        n9 += 5;                //  with compound assignment - implicit type casting happens

        System.out.println(n9);

    }

}
