package Util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converterDollarToReal(double priceDollar, double qt){
        return priceDollar*qt*(1+IOF);
    }
}
