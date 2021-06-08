package com.andrewrnagel.statapp.norm;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class NormTest {
    //Main Methods
    //public void mainTest() {}



    //Supporting Methods
    @Test
    public void normTest() {
        //Symmetric Distributions
        assertEquals(0.3830, Norm.integrate(-0.5, 0.5), 0.0001);
        assertEquals(0.6826, Norm.integrate(-1, 1), 0.0001);
        assertEquals(0.8664, Norm.integrate(-1.5, 1.5), 0.0001);
        assertEquals(0.9544, Norm.integrate(-2, 2), 0.0001);
        assertEquals(0.9876, Norm.integrate(-2.5, 2.5), 0.0001);
        assertEquals(0.9974, Norm.integrate(-3, 3), 0.0001);
        assertEquals(0.9995, Norm.integrate(-3.5, 3.5), 0.0001);
        assertEquals(1.0000, Norm.integrate(-50, 50), 0.0001);
        //Asymmetric Distributions
        assertEquals(0.1915, Norm.integrate(-0.5, 0), 0.0001);
        assertEquals(0.1915, Norm.integrate(0, 0.5), 0.0001);
        assertEquals(0.1498, Norm.integrate(-1, -0.5), 0.0001);
        assertEquals(0.1498, Norm.integrate(0.5, 1), 0.0001);
        assertEquals(0.1359, Norm.integrate(-2, -1), 0.0001);
        assertEquals(0.1359, Norm.integrate(1, 2), 0.0001);
    }
    //public void logResultTest() {}

}
