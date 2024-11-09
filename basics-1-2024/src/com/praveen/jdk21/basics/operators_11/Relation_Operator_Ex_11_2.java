package com.praveen.jdk21.basics.operators_11;

public class Relation_Operator_Ex_11_2 {

    public static void main(String[] args) {

        /*
            Relational Operators

            == != > < >= <=
         */
        int n1 = 10;
        int n2 = 20;

        System.out.println( n1 + " == " + n2 + " => " + ( n1 == n2 ) );
        System.out.println( n1 + " != " + n2 + " => " + ( n1 != n2 ) );
        System.out.println( n1 + " >  " + n2 + " => " + ( n1 > n2 ) );
        System.out.println( n1 + " <  " + n2 + " => " + ( n1 < n2 ) );
        System.out.println( n1 + " >= " + n2 + " => " + ( n1 >= n2 ) );
        System.out.println( n1 + " <= " + n2 + " => " + ( n1 <= n2 ) );

        /*
            Experiments
         */
        // primitives are implicitly type casted when compared
        int     n3  =   5;
        double  n4  =   5.0;

        System.out.println( n3 == n4 );

        // Char -> comparison - Unicode Value of Char is used to compare
        char    ch1 =   'a';
        int     n5  =   97;

        System.out.println(ch1 == n5);

        // NaN -> any undesirable math op will result NaN
        double n6 = 0.0 / 0.0;

        System.out.println("value of n6 : " + n6);

        double     n7  =   200;

        // except for != all other comparison against NaN will return false
        System.out.println( n6 + " > " + n7 + " => " + ( n6 > n7 ) );
        System.out.println( n6 + " < " + n7 + " => " + ( n6 < n7 ) );
        System.out.println( n6 + " != " + n7 + " => " + ( n6 != n7 ) );


        // boolean -> comparison
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( bool1 + " == " + bool2 + " => " + (bool1 == bool2) );
    }
}
