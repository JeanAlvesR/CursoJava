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
        float tax = 0.0f;
        if(annualIncome<20000.00){
            tax = 0.15f;
        }
        else{
            tax = 0.25f;
        }
        if (healthExpenditures==0){
            return tax*annualIncome;
        }

        return tax*annualIncome - (0.5*healthExpenditures);
    }
}
