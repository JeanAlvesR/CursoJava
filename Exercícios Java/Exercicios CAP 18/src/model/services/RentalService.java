package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice (CarRental carRental){
        long t1 = carRental.getStart().getTime();//Retorna em milissegundos
        long t2 = carRental.getFinish().getTime();
        double hours = (double)(t2-t1)/(1000*60*60);
        double basicPayment;

        if(hours<=12.0){
            basicPayment = Math.ceil(hours)*pricePerHour;//Math.ceil arredonda para cima.
        }
        else {
            basicPayment = Math.ceil(hours/24)*pricePerDay;//Math.ceil arredonda para cima.
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
