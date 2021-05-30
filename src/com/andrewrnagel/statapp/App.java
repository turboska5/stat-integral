package com.andrewrnagel.statapp;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;

public class App {

    public static void main(String[] args) {
        if(args.length == 2) {
            int lowerBound = Integer.parseInt(args[0]);
            int upperBound = Integer.parseInt(args[1]);

            UnivariateFunction statDistributionFunctionAsUnivariate = new StatDistributionFunction();
            double solution = new SimpsonIntegrator(10, 20).integrate(10_000, statDistributionFunctionAsUnivariate, lowerBound, upperBound);
            System.out.println("The Simpson integration from [" + lowerBound + "] to [" + upperBound + "] " +
                "of function [" + statDistributionFunctionAsUnivariate.toString() + "] is: [" + solution + "]");
        }
    }

}
