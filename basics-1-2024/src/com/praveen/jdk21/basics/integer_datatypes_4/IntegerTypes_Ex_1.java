package com.praveen.jdk21.basics.integer_datatypes_4;

public class IntegerTypes_Ex_1 {

    public static void main(String[] args) {

        /*
         *  we will see integer data types - byte, short, int and long
         *
         *    byte  -   8 bit or 1 byte / -128 to 127 ( -2^7 to 2^7 - 1 )
         *    short -  16 bit or 2 byte / - 32768 to 32767 ( -2^15 -to- 2^15 - 1 )
         *    int   -  32 bit or 4 byte / -2147483648 -to- 2147483647 ( -2^31 -to- 2^31-1)
         *    long  -  64 bit or 8 byte / -9223372036854775808 -to- 9223372036854775807 ( -2^63 -to- 2^63-1)
         */

        System.out.println("Range of byte  : " + Byte.MIN_VALUE + " -to- " + Byte.MAX_VALUE);
        System.out.println("Range of short : " + Short.MIN_VALUE + " -to- " + Short.MAX_VALUE);
        System.out.println("Range of int   : " + Integer.MIN_VALUE + " -to- " + Integer.MAX_VALUE);
        System.out.println("Range of long  : " + Long.MIN_VALUE + " -to- " + Long.MAX_VALUE);


        /*
            Underscores in Integer types.
         */

        byte b1 = 1_2_0;
        System.out.println("value of b1: " + b1);

        /*
            long - specify L when the number is too large (i.e., > int )
         */
        long l1 = 2147483648L;
        System.out.println("Value of l1: " + l1);

    }
}
