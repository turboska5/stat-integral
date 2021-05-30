package com.andrewrnagel.statapp.percentset;

import org.apache.commons.math3.analysis.UnivariateFunction;

public class FxInverseStdDevDistribution implements UnivariateFunction {
    public double value(double x) {
        return Math.sqrt(2 * Math.log(Math.sqrt(2 * Math.PI) * x));
    }

    @Override
    public String toString() {
        return "Math.sqrt(2 * Math.log(Math.sqrt(2 * Math.PI) * x))";
    }

}
