package HierarquiaEmployee;

//A classe BasePlusCommissionEmployee � herdada de CommissionEmployee
// e acessa os dados private da superclasse via
//m�todos public herdados.

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary; // sal�rio base por semana

	// construtor de seis argumentos
	public BasePlusCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, 
			double commissionRate, double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, 
				grossSales, commissionRate);   
		this.baseSalary = baseSalary;
	}

	// definir sal�rio base
	public void setBaseSalary(double baseSalary)
	{
		if (baseSalary < 0.0)                   
			throw new IllegalArgumentException(
					"O sal�rio base deve ser >= 0.0");  

		this.baseSalary = baseSalary;                
	} 

	// Sal�rio base de retorno
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

	// retorna String representa��o da BasePlusCommissionEmployee
	@Override
	public String toString()
	{
		return String.format(super.toString(), "base salary", getBaseSalary());   
	} 
}
