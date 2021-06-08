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
        assertEquals(0.382, Norm.integrate(-0.5, 0.5), 0.001);
        assertEquals(0.682, Norm.integrate(-1, 1), 0.001);
        assertEquals(0.866, Norm.integrate(-1.5, 1.5), 0.001);
        assertEquals(0.954, Norm.integrate(-2, 2), 0.001);
        assertEquals(0.988, Norm.integrate(-2.5, 2.5), 0.001);
        assertEquals(0.998, Norm.integrate(-3, 3), 0.001);
        assertEquals(1.000, Norm.integrate(-3.5, 3.5), 0.001);
        assertEquals(1.000, Norm.integrate(-50, 50), 0.001);
        //Asymmetric Distributions
        assertEquals(0.191, Norm.integrate(-0.5, 0), 0.001);
        assertEquals(0.191, Norm.integrate(0, 0.5), 0.001);
        assertEquals(0.150, Norm.integrate(-1, -0.5), 0.001);
        assertEquals(0.150, Norm.integrate(0.5, 1), 0.001);
        assertEquals(0.136, Norm.integrate(-2, -1), 0.001);
        assertEquals(0.136, Norm.integrate(1, 2), 0.001);
    }
    //public void logResultTest() {}

}
