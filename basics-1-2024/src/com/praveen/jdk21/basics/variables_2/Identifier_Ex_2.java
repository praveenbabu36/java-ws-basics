package com.praveen.jdk21.basics.variables_2;

public class Identifier_Ex_2 {

    public static void main(String[] args) {

        /*
            Rule 1: Identifiers can contain only

                            a to z, A to Z, 0 to 9, $ and _
         */

        int currentLocation;
        //int currentLocation%;   // Invalid

        /*
            Rule 2: Reserved words cannot be used.
         */
        int numberOfMonths = 12;

        //int case = 200;  // Invalid


        /*
            Rule 3: Predefined Java Class Names
         */

        int String = 500;
        System.out.println(String);     // valid but *discouraged*


        /*
            Rule 4: Cannot begin with a degit
         */
        int x1 = 100;
        //int 2x = 500;   //Invalid

        /*
            Rule 5: Case Sensitive
         */
        int zipCode = 59303;
        int ZipCode = 19234;
        int zipCODE = 90391;

        System.out.println(zipCode + " "  + ZipCode + " " + zipCODE);


        /*
            Rule 6: Excessive Long Names
         */
        float annualInflationPercentageForNorthAmerica = 8.58595f;      //  valid but *discouraged*
        System.out.println(annualInflationPercentageForNorthAmerica);
    }
}
