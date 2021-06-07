package com.andrewrnagel.statapp.norminv;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class NormInvTest {

    @Test
    public void normInvTest() {
        assertEquals(0.5, NormInv.compute(0.382), 0.001);
        assertEquals(1, NormInv.compute(0.682), 0.001);
        assertEquals(1.5, NormInv.compute(0.866), 0.001);
        assertEquals(2.0, NormInv.compute(0.954), 0.001);
        assertEquals(2.5, NormInv.compute(0.988), 0.001);
        assertEquals(3, NormInv.compute(0.998), 0.001);
    }

}
