package com.praveen.jdk21.basics.operators_11;

public class Arithmetic_Operator_Ex_11_1 {

    public static void main(String[] args) {

        /*
            Arithmetic Operators    ==>    + - * / % ++ --
         */
        int a = 20;
        int b = 5;
        int c = 3;

        System.out.println(" a + b = " + ( a + b ) );
        System.out.println(" a - b = " + ( a - b ) );
        System.out.println(" a * b = " + ( a * b ) );
        System.out.println(" a / b = " + ( a / b ) );
        System.out.println(" a % c = " + ( a % c ) );

        // increment
        //      pre increment   -- increment first and assignment next
        //      post increment  -- assignment first and increment next
        int x = 100;
        int y = x++; // post increment
        int z = ++x; // pre increment

        System.out.println("value of x : " + x);
        System.out.println("value of y : " + y);
        System.out.println("value of z : " + z);


        // Increment / Decrement - Rules

        // # 1 : Increment or Decrement works only with variables not with values
        // int x = 100++;  // error

        // # 2 : Nesting is not allowed
        int n1 = 100;
        // int n2 = ++(n1++);  // nesting of incr / decr operators not allowed

        // # 3 : Const value cannot be incremented or decremented
        final int n3 = 200;
        //int n4 = n3++;  // compilation error

        // # 4 : Apply to Primitive except boolean
        boolean b1 = true;
        // b1++; // error

        // # 5 : Always increment or decrement by 1.
        //          if increment or decrement needs to be other than 1, use += / -= operator
        int n5 = 200;
        n5 += 15;
        System.out.println("value of n5 : " + n5);

        // # 6 : Increment / Decrement on Chars
        char ch1 = 'a';
        ch1++;
        System.out.println("Value of ch1: " + ch1);

    }
}
