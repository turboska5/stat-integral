package com.andrewrnagel.statapp.norminv;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class NormInvTest {
    //Main Methods
    //public void mainTest() {}



    //Supporting Methods
    @Test
    public void computeTest() {
        //Known Values using Standard Normal Distribution 
        assertEquals(0.5, NormInv.compute(0.3830), 0.0001);
        assertEquals(1, NormInv.compute(0.6826), 0.0001);
        assertEquals(1.5, NormInv.compute(0.8664), 0.0001);
        assertEquals(2.0, NormInv.compute(0.9544), 0.0001);
        assertEquals(2.5, NormInv.compute(0.9876), 0.0001);
        assertEquals(3, NormInv.compute(0.9974), 0.0001);
        assertEquals(3.5, NormInv.compute(0.9995), 0.0001);
        assertEquals(50, NormInv.compute(1.0000), 0.0001);
    }
    //public void logResultTest()
}
