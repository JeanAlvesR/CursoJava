package application;

import entities.RoomReg;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RoomReg[] vect = new RoomReg[n];

        sc.close();
    }
}
