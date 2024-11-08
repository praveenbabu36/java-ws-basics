package com.praveen.jdk21.basics.strings_8;

public class StringsExample {

    public static void main(String[] args) {

        // String literal
        String greeting1 = "Hello World";
        String greeting2 = "Hello World";

        System.out.println("value of greeting1 : " + greeting1);
        System.out.println("value of greeting2 : " + greeting2);

        System.out.println(" --literal-> is greeting1 == greeting2 ? " + (greeting1 == greeting2));

        // String Object
        String greeting3 = new String("Hello Universe");
        String greeting4 = new String("Hello Universe");

        System.out.println("value of greeting3 : " + greeting3);
        System.out.println("value of greeting4 : " + greeting4);

        System.out.println(" ---object-> is greeting3 == greeting4 ? " + (greeting3 == greeting4));


        // String Concatenation
        System.out.println("I sold " + 20 + " books.");

        // String formatting
        int numOfPens = 25;
        System.out.printf("I bought %d pens.", numOfPens);

    }
}
