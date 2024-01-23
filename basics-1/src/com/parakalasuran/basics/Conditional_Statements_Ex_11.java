package com.parakalasuran.basics;

import java.util.Scanner;

public class Conditional_Statements_Ex_11 {

    public static void main(String[] args) {

        // Conditional Statements

        int marks = 75;

        // if
        /*
        if( marks > 80) {
            System.out.println("You've achieved Class - I in the exam.");
        }

        System.out.println("Keep up good work.");
        */

        // if...else
        /*
        if( marks > 80) {
            System.out.println("You've achieved Class - I in the exam.");
        } else {
            System.out.println("You've achieved Class - II in the exam.");
        }

        System.out.println("Keep up good work.");
        */

        // if - expects the condition to return boolean
        /*
        boolean y = 10;
        if( y = 0 ) {
            System.out.println("y is 0");
        }else{
            System.out.println("y is not 0");
        }
        */

        /*
            How if handles boolean?
         */
        /*
        boolean x = true;
        if( x = false ) {
            System.out.println("x is false");
        }else{
            System.out.println("x is true");
        }

        System.out.println("value of x:" + x);

        x = false;
        if( x == true ) {
            System.out.println("x is true");
        }else{
            System.out.println("x is false");
        }
        */

        /*
            if...else if - laddered if else
         */
        marks = 45;

        /*

        if( marks >= 80) {
            System.out.println("Grade - I");

            // Nested If
            if(marks >= 90 )
                System.out.println("Star Performer");

        } else if ( marks >= 60) {
            System.out.println("Grade - II");
        } else if ( marks > 40 ){
            System.out.println("Grade - III");
        } else {
            System.out.println("Fail");
        }
        */

        /*
            Exercise
         */


        int age = 56;

        /*
        if( age < 21 )
            System.out.println("Ineligible");
        else if( age > 21 && age < 55 )
            System.out.println("Savings Account");
        else if( age > 55 )
            System.out.println("Senior Citizen Account");
        */



        /*
            While Loop

            while( condition ) {
                // statements
             }
         */

        /*

        int n = 5; // counter

        while( n > 0) {
            System.out.println("*****");
            n--;
        }

        */

        /*
            flavors of while loops
         */
        int n1 = 2;

        /*
        while(n1 = 10.05){             // invalid
            System.out.println();
        }

        while(n1 = 10){             // invalid
            System.out.println();
        }
        */


        /*
            Optional curly braces
         */
        /*
        while(true) // valid but infinite
            System.out.println("****");


        while(true) // declaration "not" allowed in here
            int n3 = 100;


        while(true) { // declaration allowed in here
            int n3 = 100;
        }
        */


        /*
            unreachable codes
         */
        /*
        while(true) {
            System.out.println("*****");
        }
        System.out.println("------"); // unreachable code

        while(false){
            System.out.println("*****");    // unreachable
        }
        System.out.println("------");   // prints this

        */

        /*
            Behavior of final variables in while loop
         */

        /*
        //final int a = 10, b = 20; // this throws unreachable code compilation error in while loop.
        int a = 10, b = 20; // but this will not throw unreachable

        while( a < b )   // infinite loop
            System.out.println("a is less than b");
        System.out.println("End of check.");

        */


        /*
            Factorial using while loop
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate factorial : ");
        int num1 = sc.nextInt();
        int output = 1;
        while(num1 > 1) {
            output *= num1;
            num1 -= 1;
        }
        System.out.println("Factorial : " + output);
        */


        /*
            do while
         */

        int counter = 1;

        do {
            System.out.println(counter + " Repeat after me...");
            counter++;
        }while(counter < 1);

        System.out.println("End of loop.");


        /*
            do while - other flavors
         */
        do
            System.out.println("Hello");
        while (counter<2);
        /*
        //declaration not allowed
        do
            int count2 = 200;
        while (counter<2);

        */

        /*
            infinite loops & "unreachable" code
         */
        /*
        do {
            System.out.println("Hello");
        }while(true);
        System.out.println("Hi");  // unreachable code coz of infinite loop

        */


        /*
            infinite loop but not "unreachable" code
         */
        /*
        int a=10, b=20;

        do{
            System.out.println("Hello");
        }while(a<b);
        System.out.println("Hi"); // compiler doesnt know that this is unreachable
        */

       /*
         do while with final variables
        */
        final int a=10, b=20;

        do{
            System.out.println("Hello");
        }while(a<b);
        System.out.println("Hi"); // compiler know that this is unreachable bcoz of final variable


    }

}
