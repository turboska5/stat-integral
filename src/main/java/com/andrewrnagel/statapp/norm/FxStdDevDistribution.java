package com.andrewrnagel.statapp.norm;

import org.apache.commons.math3.analysis.UnivariateFunction;

public class FxStdDevDistribution implements UnivariateFunction {
    public double value(double x) {
        return Math.pow(Math.E, (-0.5 * x * x)) / (Math.sqrt(2 * Math.PI));
    }

    @Override
    public String toString() {
        return "Math.pow(Math.E, (-0.5 * x * x)) / (Math.sqrt(2 * Math.PI))";
    }

}
