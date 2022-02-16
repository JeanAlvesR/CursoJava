package application;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("NARUTO");
        list.add("GON");
        list.add("GOKU");
        list.add("LUFFY");
        list.add("VEGETA");
        list.add(2,"KILLUA");//Sobrecarga que add com base no índice.

        for(String x: list){
            System.out.println(x);
        }
        System.out.println(list.size());;
        list.remove("VEGETA");//Remove com base no nome
        list.remove(0); //Remove com base no índice
        System.out.println();
        for(String x: list){
            System.out.println(x);
        }
        System.out.println("---------------------------");
        list.removeIf(x -> x.charAt(0)== 'G');//Predicado: Retorno true ou false
        for(String x: list){
            System.out.println(x);
        }

        //Acha o index
        System.out.println("i: "+list.indexOf("LUFFY"));


        System.out.println("\n--------------------- Lista nova------------------------\n");
        //Forma de filtrar e add em uma nova lista
        List<String> result = list.stream().filter(x -> x.charAt(0)== 'L').collect(Collectors.toList());

        for(String x: result){
            System.out.println(x);
            System.out.println(result.size());
        }

        //Procura o elemento iniciando com 'L' usando filter e o findFirst filtra para apenas o primeiro e, se nao achar, retorna null -ou qualquer outra coisa que queira-, com o orELse().
        String name = list.stream().filter(x -> x.charAt(0)== 'L').findFirst().orElse(null);
        System.out.println(name);
        name = list.stream().filter(x -> x.charAt(0)== 'J').findFirst().orElse(null);
        System.out.println(name);

        sc.close();
    }
}
