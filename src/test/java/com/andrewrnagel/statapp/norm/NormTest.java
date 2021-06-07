package com.andrewrnagel.statapp.norm;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class NormTest {

    @Test
    public void normTest() {
        assertEquals(0.382, Norm.integrate(0.5), 0.001);
        assertEquals(0.682, Norm.integrate(1), 0.001);
        assertEquals(0.866, Norm.integrate(1.5), 0.001);
        assertEquals(0.954, Norm.integrate(2), 0.001);
        assertEquals(0.988, Norm.integrate(2.5), 0.001);
        assertEquals(0.998, Norm.integrate(3), 0.001);
    }

}
