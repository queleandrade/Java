package pagamentoPolimorfico;

public class CommissionEmployee extends Employee
{
	//variavéis de instâncias
	protected double grossSales; //vendas brutas
	protected double commissionRate; //taxa de comissão

	public CommissionEmployee( String first, String last, String ssn, double sales, double rate)
	{
		super( first, last, ssn);
		setGrossSales( sales );
		setCommissionRate( rate );


	}

	//métodos get e set
	public double getgrossSales()
	{
		return grossSales;

	}

	public void setCommissionRate(double rate)
	{
		if (rate > 0.0 && rate < 1.0) //tratamento de execeção
			commissionRate = rate;
		else
			System.out.println("Commission rate must be > 0.0 and < 1.0");
	}

	public double getCommissionRate()
	{
		return commissionRate;

	}

	public double getCommissonRate()
	{
		return commissionRate;

	}

	
	//método de calcular as vendas brutas e taxas de comissão
	public double earnings()
	{
		return commissionRate * grossSales;
	}

	public void setGrossSales(double sales)
	{
		if (sales >= 0.0) // verificando se a vendas brutas é maior ou igual a zero
			grossSales = sales;
		else
			System.out.println("Gross sales must be >= 0.0");

	}
	
	
	//método toString sobrescrito
	@Override
	public String toString()
	{
		return String.format(super.toString() + " gross sales " + grossSales + " commission rate " +commissionRate );

	}
}
