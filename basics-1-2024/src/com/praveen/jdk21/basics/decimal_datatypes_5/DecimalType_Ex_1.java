package com.praveen.jdk21.basics.decimal_datatypes_5;

public class DecimalType_Ex_1 {

    public static void main(String[] args) {

        // float - 31 bit or 4 byte
        //   char f is not optional
        float fv_1 = 10.5868f / 2F;

        // double - 64 bit or 8 byte    -   larger precision
        //   char d is optional
        double dv_1 = 10.5868d / 2D;


        System.out.println("Value of float variable fv_1: " + fv_1);

        System.out.println("Value of double variable dv_1: " + dv_1);


        // float - 31 bit or 4 byte
        float fv_2 = 10.00f / 3F;

        // double - 64 bit or 8 byte    -   larger precision
        double dv_2 = 10.00d / 3D;


        System.out.println("Value of float variable fv_2: " + fv_2);

        System.out.println("Value of double variable dv_2: " + dv_2);


    }

}
