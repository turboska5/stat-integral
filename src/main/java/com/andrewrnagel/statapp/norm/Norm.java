package com.andrewrnagel.statapp.norm;

import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;

public class Norm {
    //Main Method
    public static void main(String[] args) {
        if(args.length == 1 || args.length == 2) {
            double lowerBound = -3;
            double upperBound = 3;
            double percentage = 0.998;

            if(args.length == 1) {
                double numStdDevsFromMean = Double.parseDouble(args[0]);
                lowerBound = -1 * numStdDevsFromMean;
                upperBound = numStdDevsFromMean;
            }

            if(args.length == 2) {
                lowerBound = Double.parseDouble(args[0]);
                upperBound = Double.parseDouble(args[1]);
            }

            percentage = integrate(lowerBound, upperBound);
            logResult(lowerBound, upperBound, percentage);
        }
    }



    //Supporting Methods
    protected static double integrate(double lowerBound, double upperBound) {
        return new SimpsonIntegrator(3, 10)
            .integrate(25_000, new FxStdDevDistribution(), lowerBound, upperBound);
    }
    protected static final void logResult(double lowerBound, double upperBound, double percentage) {
        System.out.println("The Simpson integration from [" + lowerBound + "] to [" + upperBound + "] " +
            "of Standard Normal Distribution [" + new FxStdDevDistribution() + "] is [" + percentage + "].");
    }

}
