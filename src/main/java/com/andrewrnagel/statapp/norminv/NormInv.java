package com.andrewrnagel.statapp.norminv;

public class NormInv {
    //Main Method
    public static void main(String[] args) {
        if(args.length == 1) {
            double percentage = Double.valueOf(args[0]);

            logResult(percentage, findStdDevs(percentage));
        }
    }



    //Supporting Methods
    protected static double findStdDevs(double percentage) {
        double numStdDevsFromMean = 0;
        if(percentage > 0 && percentage < 1) {
            numStdDevsFromMean = 1; //TODO: do work
//          double halfPercentage = percentage / 2;     //Ex: .95 --> 0.475
//          double lowPercent = 0.5 - halfPercentage;   //Ex: 0.5 - 0.475 --> 0.025 (-1.96 stdDevs)
//          double highPercent = 0.5 + halfPercentage;  //Ex: 0.5 + 0.475 --> 0.975 (+1.96 stdDevs)
          //Shortest interval is from -1.96 to 1.96; Return z= +/- 1.96
          //mu (mean) = 0; sigma^2 (var) = 1
          //Area from x to 0.5
        }
        if(percentage <= 0) {
            numStdDevsFromMean = 0;
        }
        if(percentage >= 1) {
            numStdDevsFromMean = 4;
        }
        return numStdDevsFromMean;
    }
    protected static final void logResult(double percentage, double numStdDevsFromMean) {
        System.out.println("The computed number of standard deviations from mean given percentage [" + percentage + "] " +
            "is [" + numStdDevsFromMean + "].");
    }

}
