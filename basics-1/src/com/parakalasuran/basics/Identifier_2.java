package com.parakalasuran.basics;

public class Identifier_2 {

    public static void main(String[] args) {

        // Identifiers

        //int 1a = 10;  // not allowed should start with char or _

        int $a = 20; // allowed

        System.out.println($a);

        int _b = 20; // allowed

        System.out.println(_b);


        //int int = 5; // reserved keywords cannot be used

        int String = 200;  // allowed

        System.out.println(String);


        // keywords are case sensitive
        int sTriNG = 250;

        int STrinG = 1000;

        System.out.println(sTriNG + " <-> " + STrinG);

    }
}
