package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        Date data = new Date();
        Order order = new Order(id, data, OrderStatus.PENDING_PAYMENT); //O enum pode receber String usando o .valueOf("");Método Estático.
        System.out.println("\n\nPEDIDO: "+order);
    }
}
