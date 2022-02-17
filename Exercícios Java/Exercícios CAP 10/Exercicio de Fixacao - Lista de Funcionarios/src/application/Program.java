/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.

int N para o número de funcionários.
Classe Funcionários com atributos: id, nome e salário.
sem repetição do id
Int x para o aumento com base no id. Se o id não existir, msg + abortar operação.
Salario nao pode ser mudado quando quiser...
Final: Mostrar lista atualizada.

*
* */

package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Employee[] vect = new Employee[n];

        for (int i = 0; i< vect.length; i++){
            System.out.println("Employee #"+(i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            int j = validator(id, vect);
                if(j !=-1){
                    System.out.println("ID already registered!\n");
                    break;
                }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            vect[i] = new Employee(id, name, salary);
            System.out.println();
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        int j = validator(id, vect);
        if(j != -1 ){
            System.out.print("Enter the percentage: ");
            float increase = sc.nextFloat();
            vect[j].salaryIncrease(increase);
        }
        else{
            System.out.println("Id not registered!\n");
        }

        System.out.println("\nList of employees:");
        for (Employee x :
             vect) {
            if(x == null){
                break;
            }
            System.out.println(x.toString());
        }

        sc.close();
    }

    public static int validator(int id, Employee[] vect){
        for (int i = 0; i< vect.length; i++){
            if(vect[i]!=null) {
                if (vect[i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }
}//Final da classe
