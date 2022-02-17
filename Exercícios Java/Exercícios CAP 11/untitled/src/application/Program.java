package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date y1 = sdf1.parse("17/02/2022");
        Date y2 = sdf2.parse("17/02/2022 10:34:50");

        Date x = new Date();//Data Atual.
        Date x2 = new Date(System.currentTimeMillis()); //Hora atual também
        Date x3 = new Date(0L); //Pode passar milissegundos.

        System.out.println(sdf1.format(y1));
        System.out.println(y2);
        System.out.println("------------------");//Só com as datas
        System.out.println(sdf1.format(x));
        System.out.println(sdf1.format(x2));
        System.out.println(sdf1.format(x3));
        System.out.println("------------------");//Com data e hora
        System.out.println(sdf2.format(x));
        System.out.println(sdf2.format(x2));
        System.out.println(sdf2.format(x3));
        System.out.println("------------------");//Horário de Greenwich
        System.out.println(sdf3.format(x));
        System.out.println(sdf3.format(x2));
        System.out.println(sdf3.format(x3));

        System.out.println();


    }
}
