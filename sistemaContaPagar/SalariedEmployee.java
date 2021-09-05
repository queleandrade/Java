package sistemaContaPagar;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // construtor
    public SalariedEmployee(String first, String last, String ssn, double salary){
        super(first, last, ssn);

        setWeeklySalary(salary);
    }
    
    // setters
    public void setWeeklySalary(double salary){
        if(salary >= 0.0f)
            this.weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0f");
    }
    
    // getters
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    
    // calcula getPaymentAmoun e sobrescreve no metodo abstarto getPaymentAmount na classe Employee
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    
    // retorna String sobrescrita
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}

