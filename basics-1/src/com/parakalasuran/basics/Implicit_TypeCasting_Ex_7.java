package com.parakalasuran.basics;

public class Implicit_TypeCasting_Ex_7 {

    public static void main(String[] args) {

        // byte to int
        byte b = 127;

        int a = b;

        System.out.println("a = " + b);

        // int to double
        double d1 = a;

        System.out.println("d1 = " + d1);

        //char to int
        char c = 'a';

        int c1 = c; // ascii of 'a' is 97

        System.out.println("c1 = " + c1);

    }

}
