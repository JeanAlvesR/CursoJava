package Application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

/*
* Cálculo da área, perímetro e diagonal de um retângulo.
* */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Rectangle Calculator: Area, perimeter and diagonal");
        System.out.print("Insert Width: " );
        rectangle.setWidth(sc.nextDouble());
        System.out.print("Insert Height: " );
        rectangle.setHeight(sc.nextDouble());

        System.out.println("AREA = "+rectangle.area());
        System.out.println("PERIMETER = "+rectangle.perimeter());
        System.out.println("DIAGONAL = "+rectangle.diagonal());

        sc.close();
    }
}
