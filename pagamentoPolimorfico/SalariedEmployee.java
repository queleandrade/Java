package pagamentoPolimorfico;

public class SalariedEmployee extends Employee
{

	private double weeklySalary; //variavél de instância - salário semanal

	
	//construtor
	public SalariedEmployee( String first, String last, String ssn, double salary)
	{
		super( first, last, ssn);
		setWeeklySalary(salary);
	}

	
	//métodos get e set 
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

	//Método de ganhos, isto é, salário
	public double earnings()
	{
		return weeklySalary;
	}
	
	//método toString sobrescrito 
	@Override 
	public String toString()
	{
		return String.format("Salaried Employee: " + super.toString() + " weekly salay" + getWeeklySalary()  );
	}
}
