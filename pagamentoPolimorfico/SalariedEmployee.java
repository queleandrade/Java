package pagamentoPolimorfico;

public class SalariedEmployee extends Employee
{

	private double weeklySalary; //variav�l de inst�ncia - sal�rio semanal

	
	//construtor
	public SalariedEmployee( String first, String last, String ssn, double salary)
	{
		super( first, last, ssn);
		setWeeklySalary(salary);
	}

	
	//m�todos get e set 
	public void setWeeklySalary(double salary)
	{
		if (salary >= 0.0)
			this.weeklySalary = salary;
		else 
			System.out.println("Weekly salary must be >== 0.0");
	}
	
	public double getWeeklySalary()
	{
		return weeklySalary;
	}

	//M�todo de ganhos, isto �, sal�rio
	public double earnings()
	{
		return weeklySalary;
	}
	
	//m�todo toString sobrescrito 
	@Override 
	public String toString()
	{
		return String.format("Salaried Employee: " + super.toString() + " weekly salay" + getWeeklySalary()  );
	}
}
