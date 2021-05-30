package com.andrewrnagel.statapp;

import org.apache.commons.math3.analysis.UnivariateFunction;

public class StatDistributionFunction implements UnivariateFunction {
    public double value(double x) {
        return (Math.pow(Math.E, (Math.pow(x, 2) / -2))) / (Math.sqrt(2 * Math.PI));
    }

    @Override
    public String toString() {
        return "(Math.pow(Math.E, (Math.pow(x, 2) / -2))) / (Math.sqrt(2 * Math.PI))";
    }

}
