package com.praveen.jdk21.basics.enums;

import java.util.Arrays;

public class EnumExample {

    public static void main(String[] args) {

        enum State {
            ON, OFF
        }

        enum Days {
            SUN, MON, TUE, WED, THU, FRI, SAT
        }

        // Print Enum
        System.out.println(Days.MON + "  " + Days.SAT);

        // name() - value of enum
        Days d1 = Days.TUE;
        System.out.println( "value of d1 : " + d1.name() );

        // values() - return array of enum values
        System.out.println( "value @ 0 : " + Days.values()[0] );

        // valueof() - get enum const for the value passed
        String d2 = "THU";
        System.out.println( "value of d2 : " + Days.valueOf(d2) );

        // ordinal - index of the enum
        Days d3 = Days.FRI;
        System.out.println("Index of d3: " + d3.ordinal());
    }
}
