package com.parakalasuran.basics;

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

        int n = 5; // counter

        while( n > 0) {
            System.out.println("*****");
            n--;
        }


    }

}
