package com.currency;

public class CurrencyConverter {

    static double USD_TO_INR = 83.0;
    static double EUR_TO_INR = 90.0;
    static double USD_TO_EUR = 0.92;

    // Rupee to Dollar
    public double rupeeToDollar(double rupee) {
        return rupee / USD_TO_INR;
    }

    // Dollar to Rupee
    public double dollarToRupee(double dollar) {
        return dollar * USD_TO_INR;
    }

    // Rupee to Euro
    public double rupeeToEuro(double rupee) {
        return rupee / EUR_TO_INR;
    }

    // Euro to Rupee
    public double euroToRupee(double euro) {
        return euro * EUR_TO_INR;
    }

    // Dollar to Euro
    public double dollarToEuro(double dollar) {
        return dollar * USD_TO_EUR;
    }

    // Euro to Dollar
    public double euroToDollar(double euro) {
        return euro / USD_TO_EUR;
    }
}