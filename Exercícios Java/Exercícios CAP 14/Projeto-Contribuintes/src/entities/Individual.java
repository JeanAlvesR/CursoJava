package entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double tax = (annualIncome < 20000.00) ? 0.15 :0.25;
        if (healthExpenditures > 0){
            return tax*annualIncome - (0.50*healthExpenditures);
        }
        return tax*annualIncome;
    }
}
