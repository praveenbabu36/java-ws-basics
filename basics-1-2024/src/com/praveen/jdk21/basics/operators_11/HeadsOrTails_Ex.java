package com.praveen.jdk21.basics.operators_11;

public class HeadsOrTails_Ex {

    public static void main(String[] args) {

        int chance = (int)Math.round(Math.random());

        String result = chance > 0 ? "Heads" : "Tails";

        System.out.println(result);
    }
}
