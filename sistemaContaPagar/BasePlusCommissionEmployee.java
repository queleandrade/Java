package sistemaContaPagar;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // construtor
    public BasePlusCommissionEmployee(String first, String last, String ssn,
            double sales, double rate, double salary){
        super(first, last, ssn, sales, rate);

        setBaseSalary(salary);
    }

    // set
    public void setBaseSalary(double salary){
        if(salary >= 0.0f)
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0f");
    }
    
    // get
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    // calcula getPaymentAmount e sobrescreve o método getPaymentAmount em CommissionEmployee
    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }
    
    // retorna String sobrescrevendo em CommissionEmployee 
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}