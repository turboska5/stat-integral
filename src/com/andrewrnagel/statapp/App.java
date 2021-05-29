package com.andrewrnagel.statapp;

public class App {

    public static void main(String[] args) {
        if(args.length == 1) {
            int input = Integer.parseInt(args[0]);
            System.out.println("Your input was: [" + input + "]!");
        }
    }

}
