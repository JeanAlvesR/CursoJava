/*Um site de internet registra um log de acessos dos usuários. Um registro de log consiste no nome
do usuário (apenas uma palavra) e o instante em que o usuário acessou o site no padrão ISO 8601,
separados por espaço, conforme exemplo. Fazer um programa que leia o log de acessos a partir de
um arquivo, e daí informe quantos usuários distintos acessaram o site.
*/

package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        String path = "/home/jean/Documentos/GitHub/Exercícios Java/Exercicios CAP 19/AccessRegister/Log.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while(line!=null) {
                String[] fields = line.split(" ");
                set.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));//A estrutura set não recebe repetidos que, no caso, será em função do nome por causa do método HashCode e Equals criados na classe LogEntry

                line = br.readLine();
            }

            System.out.println("Total users: "+set.size());

        }
        catch (IOException e){
            System.out.println("ERROR: "+ e.getMessage());
        }

    }
}
