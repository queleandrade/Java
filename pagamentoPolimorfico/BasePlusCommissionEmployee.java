package pagamentoPolimorfico;

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
	
	//construtor
	private double baseSalary;
	public BasePlusCommissionEmployee (String first, String last, String ssn, double rate, double salary)
	{
		super( first, last, ssn, rate, salary);
		setBaseSalary(salary);


	}

	//m�todos set e get
	public void setBaseSalary(double salary)
	{
		if (salary >= 0.0) //exece��o caso o sal�rio for menos ou igual a zero
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");

	}

	public double getBaseSalary()
	{
		return baseSalary;
	}

	//m�todo toString sobrescrito
	@Override
	public String toString()
	{
		return String.format(super.toString() + " base salary " + baseSalary );
	}


}
