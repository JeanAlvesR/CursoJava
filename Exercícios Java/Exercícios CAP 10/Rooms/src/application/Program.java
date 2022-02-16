package application;

import entities.RoomReg;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms wil be rented? ");

        RoomReg[] vect = new RoomReg[10];
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println("Rent #"+(i+1)+":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new RoomReg(name, email, room);
            System.out.println();
        }
        System.out.println("\nBusy rooms:");
        for(int i=0; i< vect.length; i++){
            if(vect[i]!=null){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
