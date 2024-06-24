package com.praveen.jdk21.basics.variables_2;

public class Variable_Ex_1 {

    public static void main(String[] args) {

        // Declaration
        int variable1;

        // Initialization
        variable1 = 10;     //  cant use the variable without initialization

        // print
        System.out.println("value of variable1 :" + variable1);


        // Declaration and Initialization together
        int variable2 = 200;

        // print
        System.out.println("Value of variable2 :" + variable2);


        // Declaration and initialization with arithmetic operation
        int total = variable1 + variable2;

        System.out.println("Total :"+ total);


        // Reassigning new value to variable
        variable2 = 100;

        System.out.println("After reassignment. Value of variable2 :" + variable2);

    }

}
