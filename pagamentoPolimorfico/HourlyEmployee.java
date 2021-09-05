package pagamentoPolimorfico;

public class HourlyEmployee extends Employee {

	//variavéis de instâncias
	private double wage; // salário por hora
	private double hours; // horas trabalhadas por semana

	// construtor
	public HourlyEmployee( String first, String last, String ssn, double hourlyWage, double hoursWorked )
	{
		super( first, last, ssn);
		setWage( hourlyWage );
		setHours( hoursWorked ); 
	} 

	// métodos set e get
	public void setWage( double hourlyWage )
	{
		if ( hourlyWage >= 0.0 )
			wage = hourlyWage;
		else
			throw new IllegalArgumentException( "Hourly wage must be >= 0.0" ); //tratamento de execeção
	} 

	public double getWage()
	{
		return wage;
	}

	public void setHours( double hoursWorked )
	{
		if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
			hours = hoursWorked;
		else
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0" ); //tratamento de exceção
	} 

	public double getHours()
	{
		return hours;
	}



	// calcular ganhos e sobrescrever ganhos de método abstrato em Funcionário
	@Override
	public double earnings()
	{
		if ( getHours() <= 40 ) // sem horas extras
			return getWage() * getHours();
		else
			return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
	} 
	
	// método toStrin sobrescrito

	@Override
	public String toString()
	{
		return String.format( "hourly employee: "+ super.toString() + " hourly wage", getWage(),
				"hours worked", getHours() );
	} 
}
