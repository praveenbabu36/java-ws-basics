package com.praveen.jdk21.basics.operators_11;

public class Operator_Precedence_Ex_11_7 {

    public static void main(String[] args) {

        /*
            Operator Precedence
         */

        int result1 =  5 - 3 * 10;

        System.out.println(result1);

        /*
            Things to remember  -
         */

        // Associativity - Look the associativity when the operators of same precedence is used.
        //                      Below Ex. Operators are evaluated from left to right
        int result2  = 10 / 2 * 5;  //  * and / are at same precedence level.

        System.out.println(result2);    //  result is 25 not 1


        // Parantheses - Use Parantheses to control the order of evaluation
        int result3 =   10 / ( 2 * 5 ); //  result is 1

        System.out.println(result3);

        // Ex
        int x = 5;
        int y = 10;

        int result4 = x++ * --y;    //  ++ -- takes precedence than * 

        System.out.println(result4);

    }

}
