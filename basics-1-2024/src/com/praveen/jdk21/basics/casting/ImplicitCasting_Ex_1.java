package com.praveen.jdk21.basics.casting;

public class ImplicitCasting_Ex_1 {

    public static void main(String[] args) {

        byte b = 100;

        int x = b;

        System.out.println("value of x : " + x);

        /**
         * implicitly typecasting is allowed when widening of data type happens
         *
         * order of data types:
         *
         * byte < short < int < long < float < double
         *
         * char < int
         */

        int i = 230;

        double d = i;

        System.out.println("Value of d : " + d);

        // char to int

        char c = 'a';

        int i1 = c;

        System.out.println("value of i1 : " + i1);





    }
}
