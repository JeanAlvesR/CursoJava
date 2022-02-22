package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good Morning","Good Afternoon","Good Night"};
        String path = "/home/jean/Downloads/arquivoCriadoNoJava.txt";

        //Se for só um parametro, ele recria ou cria o arquivo. Se passar o parametro true, ele incompora o que já existia antes com o mesmo nome.
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
