package com.andrewrnagel.statapp;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;

public class App {

    public static void main(String[] args) {
        if(args.length == 2) {
            double lowerBound = convertArg(args[0]);
            double upperBound = convertArg(args[1]);

            UnivariateFunction thiFunction = new StatDistributionFunction();
            double solution = new SimpsonIntegrator(10, 20).integrate(10000, thiFunction, lowerBound, upperBound);
            System.out.println("The Simpson integration from [" + lowerBound + "] to [" + upperBound + "] " +
                "of function [" + thiFunction.toString() + "] is: [" + solution + "]");
        }
    }

    public static Double convertArg(String arg) {
        if("-inf".equalsIgnoreCase(arg)) {
            return Double.MIN_VALUE;
        }
        if("inf".equalsIgnoreCase(arg) || "+inf".equalsIgnoreCase(arg)) {
            return Double.MAX_VALUE;
        }
        return Double.parseDouble(arg);
    }

}
