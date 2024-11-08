package com.praveen.jdk21.basics.stmnt_expr_10;

public class StatementAndExpression_1 {

    public static void main(String[] args) {

        // Block Statement - enclosed within braces
        int x1 = 10;

        if(x1 > 5) {
            System.out.println("x1 is greater than 5");
            x1 = x1 + 5;
        }

        // Expression Statements - method call, assignments,
        //                          increment or decrement operations
        String s2 = "Hello World".toUpperCase();
        System.out.println("value of s2: " + s2);

        // Declaration Statement - Declare a variable
        int y;
        double interest = 6.5;

        // Empty Statement - just a semicolon
        ;

    }
}
