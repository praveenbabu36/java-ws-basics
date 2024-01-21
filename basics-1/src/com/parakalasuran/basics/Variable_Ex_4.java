package com.parakalasuran.basics;

public class Variable_Ex_4 {

    public static void main(String[] args) {

        // Declare Variable
        int firstVariable;

        // Initialize Variable
        firstVariable = 200;

        System.out.println(firstVariable);


        // Declare and Initialize in same place
        int secondVariable = 500;

        // Change the value of firstVariable
        firstVariable = 300;

        int total = firstVariable + secondVariable;

        System.out.println("First Var:" + firstVariable);
        System.out.println("Second Var:" + secondVariable);
        System.out.println("Total:" + total);

    }
}
