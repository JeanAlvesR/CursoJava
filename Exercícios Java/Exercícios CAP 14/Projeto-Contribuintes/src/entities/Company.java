package entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        double tax = (numberOfEmployees>10) ? 0.14 : 0.16;
        return tax*annualIncome;
    }

    public String toString(){
        return name
                +": $ "
                + String.format("%.2f",tax());
    }
}
