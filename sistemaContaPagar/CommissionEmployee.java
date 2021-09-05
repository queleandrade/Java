package sistemaContaPagar;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    // construtor
    public CommissionEmployee(String first, String last, String ssn,
            double sales, double rate){
        super(first, last, ssn);

        setGrossSales(sales);
        setCommissionRate(rate);
    }

    // setters
    public void setCommissionRate(double rate){
        if(rate > 0.0f && rate < 1.0f)
            this.commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0f and < 1.0f");
    }
    
    public void setGrossSales(double sales){
        if(sales >= 0.0f)
            this.grossSales = sales;
        else
            throw new IllegalArgumentException
                ("Gross sales muse be >= 0.0f");
    }
    // getters
    public double getCommissionRate(){
        return this.commissionRate;
    }
    public double getGrossSales(){
        return this.grossSales;
    }
    
    // calcula getPaymentAmount e sobrescreve  no método abstrato da classe Employee
	@Override
    public double getPaymentAmount(){
        return getCommissionRate() * getGrossSales();
    }
	
    // Retorna a String sobrescrita
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}

