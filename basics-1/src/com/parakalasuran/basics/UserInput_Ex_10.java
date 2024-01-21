package com.parakalasuran.basics;

import java.util.Scanner;

public class UserInput_Ex_10 {

    public static void main(String[] args) {

        // Accept user input

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your name : ");
        String fName = sc.nextLine();

        System.out.println(" Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Welcome " + fName
                                + ". Allowed to drink : " + (age > 18 ? true : false) );


    }
}
