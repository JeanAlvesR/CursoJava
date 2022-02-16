package entities;

public class BankAccount {

    private int accountNumber;
    private String holder;
    private double accountValue;

    public BankAccount(int accountNumber, String holder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);//Detalhe importante
    }
    public BankAccount(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.holder = name;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public void deposit(double value) {
        accountValue += value;
    }
    public void withdraw(double value) {
        accountValue -= (5 + value);
    }

    public String toString(){
        return         "Account: "
                +accountNumber
                +", Holder: "
                +holder
                +", Balance: $ "
                +String.format("%.2f",accountValue);

    }
}
