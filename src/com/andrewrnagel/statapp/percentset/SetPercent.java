package com.andrewrnagel.statapp.percentset;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;

public class SetPercent {

    public static void main(String[] args) {
        if(args.length == 2) {
            double lowerBound = Double.parseDouble(args[0]);
            double upperBound = Double.parseDouble(args[1]);

            UnivariateFunction inverseStdDevDistributionAsUnivariateFx = new FxInverseStdDevDistribution();
            double solution = new SimpsonIntegrator(1, 10).integrate(25_000, inverseStdDevDistributionAsUnivariateFx, lowerBound, upperBound);
            System.out.println("The Simpson integration from [" + lowerBound + "] to [" + upperBound + "] " +
                "of function [" + inverseStdDevDistributionAsUnivariateFx + "] is: [" + solution + "]");
        }
    }

}
