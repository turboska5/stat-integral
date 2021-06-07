package com.andrewrnagel.statapp.norminv;

public class NormInv {

    public static void main(String[] args) {
        if(args.length == 1) {
            double percentage = Double.parseDouble(args[0]);

            System.out.println("There are [" + compute(percentage) + "] standard deviations from the mean given " +
                "[" + percentage + "] percent of the population.");
        }
    }

    protected static double compute(double percentage) {
        double delta = percentage / 2;
        double lowerBound = 50 - delta;
        double upperBound = 50 + delta;
        return 0;
    }

}
