package com.currency;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CurrencyConverterTest {

    CurrencyConverter cc = new CurrencyConverter();

    @Test
    public void testRupeeToDollar() {
        assertEquals(1.0, cc.rupeeToDollar(83), 0.01);
    }

    @Test
    public void testDollarToRupee() {
        assertEquals(83.0, cc.dollarToRupee(1), 0.01);
    }

    @Test
    public void testRupeeToEuro() {
        assertEquals(1.0, cc.rupeeToEuro(90), 0.01);
    }

    @Test
    public void testEuroToRupee() {
        assertEquals(90.0, cc.euroToRupee(1), 0.01);
    }

    @Test
    public void testDollarToEuro() {
        assertEquals(0.92, cc.dollarToEuro(1), 0.01);
    }

    @Test
    public void testEuroToDollar() {
        assertEquals(1.08, cc.euroToDollar(1), 0.01);
    }
}