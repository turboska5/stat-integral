package com.andrewrnagel.statapp.norm;

import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;

public class Norm {

    public static void main(String[] args) {
        if(args.length == 1) {
            double numStdDevs = Double.parseDouble(args[0]);

            System.out.println("[" + integrate(numStdDevs) + "] percent of the population is found given " +
                "[" + numStdDevs + "] standard deviations from the mean.");
        }
    }

    protected static double integrate(double numStdDevs) {
        return new SimpsonIntegrator(3, 10)
            .integrate(25_000, new FxStdDevDistribution(), (-1 * numStdDevs), numStdDevs);
    }

}
