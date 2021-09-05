package sistemaContaPagar;


public class Invoice implements Payable
{
	private final String partNumber; 
	private final String partDescription;
	private int quantity;
	private double pricePerItem;

	// construtor
	public Invoice(String partNumber, String partDescription, int quantity,
			double pricePerItem)
	{
		if (quantity < 0) // valida a quantidade
			throw new IllegalArgumentException("Quantity must be >= 0");

		if (pricePerItem < 0.0) // valida o preço por item
			throw new IllegalArgumentException(
					"Price per item must be >= 0");

		this.quantity = quantity;
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.pricePerItem = pricePerItem;
	} 

	// getters
	public String getPartNumber()
	{
		return partNumber; 
	} 

	public String getPartDescription()
	{
		return partDescription;
	} 
	
	public int getQuantity()
	{
		return quantity;
	}

	public double getPricePerItem()
	{
		return pricePerItem;
	} 
	
	// setters
	public void setQuantity(int quantity)
	{
		if (quantity < 0) // valida quantidade
			throw new IllegalArgumentException("Quantity must be >= 0");

		this.quantity = quantity;
	} 


	public void setPricePerItem(double pricePerItem)
	{
		if (pricePerItem < 0.0) // valida preço por item
			throw new IllegalArgumentException(
					"Price per item must be >= 0");

		this.pricePerItem = pricePerItem;
	} 


	// retorna a String 
	@Override
	public String toString()
	{
		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(), 
				"quantity", getQuantity(), "price per item", getPricePerItem());
	} 

	// método  para realizar o contrato com interface a pagar  
	@Override                                                           
	public double getPaymentAmount()                                    
	{                                                                   
		return getQuantity() * getPricePerItem(); // calcula o custo total
	} 
}
