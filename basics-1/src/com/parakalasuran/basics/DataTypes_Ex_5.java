package com.parakalasuran.basics;

import java.io.*;

public class DataTypes_Ex_5 {

    public static void main(String[] args) {

        /*
            Primitive Data Types :

                Integers :  byte, short, int, long

                Double   :  double, float

                Character:  char

                Boolean  :  boolean
         */

        // size : 8 bit or 1 byte
        byte minByte = -128;
        byte maxByte = 127;

        // size : 16 bit or 2 byte
        short minShort = -32_768;
        short maxShort = 32_767;

        // size : 32 bit or 4 byte
        int minInt = -2_147_483_648;
        int maxInt = 2_147483_647;

        // size : 64 bit or 8 byte
        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;


        System.out.println(" Long Range : " + minByte + " <-> " + maxByte);
        System.out.println(" Long Range : " + minShort + " <-> " + maxShort);
        System.out.println(" Long Range : " + minInt + " <-> " + maxInt);
        System.out.println(" Long Range : " + minLong + " <-> " + maxLong);


        /*

            Floating point datatype.

                float   -   size : 32 bit

                double  -   size : 64 bit

         */

        float float1 = 25.5123F / 1.23F;

        float float2 = 15.1089f / 0.89f;

        double double1 = 105.31232D / 2.4D;

        double double2 = 923.98032d / 1.89d;

        System.out.println("Float  : " + float1 + " " + float2);

        System.out.println("Double : " + double1 + " " + double2);


        /*

            Char & Boolean


            boolean : 1 bit

            char    : 32 bit

         */


        boolean b1 = true;

        System.out.println("Boolean : " + b1);


        char char1 = '\u00FC';

        System.out.println("Character : " + char1);


    }

}

