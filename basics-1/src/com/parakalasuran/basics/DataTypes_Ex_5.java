package com.parakalasuran.basics;

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

    }

}
