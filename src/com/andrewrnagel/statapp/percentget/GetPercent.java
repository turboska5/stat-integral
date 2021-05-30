package com.andrewrnagel.statapp.percentget;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;

public class GetPercent {

    public static void main(String[] args) {
        if(args.length == 2) {
            double lowerBound = Double.parseDouble(args[0]);
            double upperBound = Double.parseDouble(args[1]);

            UnivariateFunction stdDevDistributionAsUnivariateFx = new FxStdDevDistribution();
            double solution = new SimpsonIntegrator(3, 10).integrate(25_000, stdDevDistributionAsUnivariateFx, lowerBound, upperBound);
            System.out.println("The Simpson integration from [" + lowerBound + "] to [" + upperBound + "] " +
                "of function [" + stdDevDistributionAsUnivariateFx + "] is: [" + solution + "]");
        }
    }

}
