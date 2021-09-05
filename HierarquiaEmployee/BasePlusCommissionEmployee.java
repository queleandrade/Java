package HierarquiaEmployee;

//A classe BasePlusCommissionEmployee é herdada de CommissionEmployee
// e acessa os dados private da superclasse via
//métodos public herdados.

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary; // salário base por semana

	// construtor de seis argumentos
	public BasePlusCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, 
			double commissionRate, double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, 
				grossSales, commissionRate);   
		this.baseSalary = baseSalary;
	}

	// definir salário base
	public void setBaseSalary(double baseSalary)
	{
		if (baseSalary < 0.0)                   
			throw new IllegalArgumentException(
					"O salário base deve ser >= 0.0");  

		this.baseSalary = baseSalary;                
	} 

	// Salário base de retorno
	public double getBaseSalary()
	{
		return baseSalary;
	} 

	// calcular ganhos
	@Override 
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	}

	// retorna String representação da BasePlusCommissionEmployee
	@Override
	public String toString()
	{
		return String.format(super.toString(), "base salary", getBaseSalary());   
	} 
}
