package com.andrewrnagel.statapp.norminv;

public class NormInv {
    //Main Method
    public static void main(String[] args) {
        if(args.length == 1) {
            double percentage = 0.998;
            double numStdDevsFromMean = 3;
            numStdDevsFromMean = compute(percentage);
            logResult(percentage, numStdDevsFromMean);
        }
    }



    //Supporting Methods
    protected static double compute(double percentage) {
        //TODO: What IS the formula?!
        return 0;
    }
    protected static final void logResult(double percentage, double numStdDevsFromMean) {
        System.out.println("The computed number of standard deviations from mean given percentage [" + percentage + "] " +
            "is [" + numStdDevsFromMean + "].");
    }

}
