/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.
*

numero conta
nome do titular (pode ser alterado)
valor de deposito inicial que o titular depositou ao abrir a conta (opcional)
o valor nao pode ser alterado diretamente.
cada saque é cobrado 5 reais. A conta pode ser negativa

*/

package Application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);//Só funciona se estiver antes do Scanner.
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount;

        System.out.println("Welcome to the bank");
        System.out.print("Account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char c = Character.toUpperCase(sc.next().charAt(0));
        double accountValue;
            if(c == 'Y') {
                System.out.print("Enter inicial deposit value: ");
                accountValue = sc.nextDouble();
                bankAccount = new BankAccount(accountNumber, name, accountValue );
            }
            else {
                bankAccount = new BankAccount(accountNumber, name);
            }
        System.out.println("\nAccount data:\nAccount: "+bankAccount.getAccountNumber()+", Holder: "+bankAccount.getHolder()+", Balance: $ "+String.format("%.2f",bankAccount.getAccountValue()));

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.deposit(deposit);
        System.out.println("Updated account data:\nAccount number: "+bankAccount.getAccountNumber()+", Holder: "+bankAccount.getHolder()+", Balance: $ "+String.format("%.2f",bankAccount.getAccountValue()));

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdraw(withdraw);
        System.out.println("Updated account data:\nAccount number: "+bankAccount.getAccountNumber()+", Holder: "+bankAccount.getHolder()+", Balance: $ "+String.format("%.2f",bankAccount.getAccountValue())+"\n\n");


        sc.close();
    }
}
