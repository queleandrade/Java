package HierarquiaEmployee;

public class CommissionEmployee extends Employee
{
	
	//variaveis de inst�ncias        
	private double grossSales;   //vendas semanais brutas
	private double commissionRate; // porcentagem da comiss�o

	// construtor
	public CommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, 
			double commissionRate)
	{
		
		super(firstName, lastName, socialSecurityNumber);

		// chamadas impl�cita do construtor e caso as vendas for inv�lida chama a exce��o
		if (grossSales < 0.0) 
			throw new IllegalArgumentException(
					"As vendas brutas devem ser >= 0.0");

		// caso porcentatem da comiss�o for inv�lida tamb�m lan�ara a exce��o
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"A porcentagem de comiss�o devem ser > 0.0 e < 1.0");
      
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	// Define qual � o valor bruto das vendas
	public void setGrossSales(double grossSales)
	{
		if (grossSales < 0.0) 
			throw new IllegalArgumentException(
					"As vendas brutas devem ser >= 0.0");

		this.grossSales = grossSales;
	} 

	// retorna a quantidade de vendas brutas
	public double getGrossSales()
	{
		return grossSales;
	} 

	// configura a taxa de comiss�o
	public void setCommissionRate(double commissionRate)
	{
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"A taxa de comiss�o deve ser > 0.0 e < 1.0");

		this.commissionRate = commissionRate;
	} 

	// retorna a taxa de comiss�o
	public double getCommissionRate()
	{
		return commissionRate;
	}

	// calcula os lucros
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	} 

	// retorna a representa��o String do objeto CommissionEmployee
	@Override 
	public String toString()
	{
		return String.format(super.toString() + "%n%s: %.2f%n%s: %.2f", 
				"Vendas brutas semanais", getGrossSales(), 
				"Porcentagem de comiss�o", getCommissionRate());
	} 
} 
