package pagamentoPolimorfico;

public class PieceWorker extends Employee {

	private double wage; // armazena o salário do funcionário por peça
	private int pieces; //armazena o número de peças produzidas

	
	//construtor
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber,
			double wage, int pieces)
	{
		super(firstName, lastName, socialSecurityNumber); //chamando o método da classe Employee

		//tratamentos de execeções remuneração do funcionário e número de peças produzidas
		if (wage < 0.0)
			throw new IllegalArgumentException
			("Wage must be >= 0");

		if (pieces < 0)
			throw new IllegalArgumentException
			("Number of pieces must be > 0");

		this.wage = wage;
		this.pieces = pieces;
	}

	// métodos set e get
	public void setWage(double wage)
	{
		if (wage < 0.0) //define que o salário não pode ser menor que zero, caso for caí no tratamento de execeção
			throw new IllegalArgumentException
			("Wage must be >= 0");
		this.wage = wage;
	} 


	public double getWage()
	{
		return wage;
	}

	
	public void setPieces(int pieces)
	{
		if (pieces < 0) //define o número de peça, caso for menor que zero caí no tratamemto de execeção
			throw new IllegalArgumentException
			("Number of pieces must be > 0");

		this.pieces = pieces;
	} 

	
	public int getPieces()
	{
		return pieces;
	} 

	//Calcula os vencimentos do funcionário multiplicando o número de peças produzido pelo salário por peças
	@Override
	public double earnings() //sobrescrito
	{
		return getPieces() * getWage();
	}
	

	// Método toString sobrescrito
	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: $%,.2f%n%s: %d", "Pieceworker Employee",
				super.toString(), "Wage per piece", getWage(), "Pieces sold", getPieces());
	} 
}