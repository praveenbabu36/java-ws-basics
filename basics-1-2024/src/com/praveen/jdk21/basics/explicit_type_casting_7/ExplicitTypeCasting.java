package com.praveen.jdk21.basics.explicit_type_casting_7;

public class ExplicitTypeCasting {

    public static void main(String[] args) {

        // int to byte
        int i1 = 257;

        // assign int to byte
        byte b2 = (byte) i1;

        System.out.println("value of byte b2: " + b2);


        // double to int
        double d1 = 4.580126;
        int i2 = (int) d1;

        System.out.println("value of int i2: " + i2);

    }

}
