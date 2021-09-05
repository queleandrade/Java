package HierarquiaEmployee;

public class CommissionEmployee extends Employee
{
	
	//variaveis de instâncias        
	private double grossSales;   //vendas semanais brutas
	private double commissionRate; // porcentagem da comissão

	// construtor
	public CommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, 
			double commissionRate)
	{
		
		super(firstName, lastName, socialSecurityNumber);

		// chamadas implícita do construtor e caso as vendas for inválida chama a exceção
		if (grossSales < 0.0) 
			throw new IllegalArgumentException(
					"As vendas brutas devem ser >= 0.0");

		// caso porcentatem da comissão for inválida também lançara a exceção
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"A porcentagem de comissão devem ser > 0.0 e < 1.0");
      
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	// Define qual é o valor bruto das vendas
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

	// configura a taxa de comissão
	public void setCommissionRate(double commissionRate)
	{
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"A taxa de comissão deve ser > 0.0 e < 1.0");

		this.commissionRate = commissionRate;
	} 

	// retorna a taxa de comissão
	public double getCommissionRate()
	{
		return commissionRate;
	}

	// calcula os lucros
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	} 

	// retorna a representação String do objeto CommissionEmployee
	@Override 
	public String toString()
	{
		return String.format(super.toString() + "%n%s: %.2f%n%s: %.2f", 
				"Vendas brutas semanais", getGrossSales(), 
				"Porcentagem de comissão", getCommissionRate());
	} 
} 
