package com.parakalasuran.basics;

import java.util.Scanner;

public class Conditional_Exercises_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        if (age >= 21)
            System.out.println("Eligible");
        else
            System.out.println("Ineligible");

    }
}
