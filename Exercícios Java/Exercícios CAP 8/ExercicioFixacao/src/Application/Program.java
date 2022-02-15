package Application;

import Util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double priceDollar = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double qt = sc.nextDouble();
        System.out.println("Amount to be paid in reais = "+ String.format("%.2f",CurrencyConverter.converterDollarToReal(priceDollar, qt)));

        sc.close();
    }
}
