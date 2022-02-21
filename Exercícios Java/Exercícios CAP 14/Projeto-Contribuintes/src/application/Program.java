package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> bdTaxPayer = new ArrayList<>();

        System.out.print("Enter the number of tax payers? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n;i++) {
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                bdTaxPayer.add(new Individual(name, annualIncome, healthExpenditures));
            }
            else{
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                bdTaxPayer.add(new Company(name, annualIncome, numberEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");
        for (TaxPayer x: bdTaxPayer) {
            System.out.println(x);
        }

        double sum = 0.0;
        for (TaxPayer x: bdTaxPayer) {
            sum+=x.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ "+String.format("%.2f",sum));
    }
}