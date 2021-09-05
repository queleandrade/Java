package pagamentoPolimorfico;

public class PieceWorker extends Employee {

	private double wage; // armazena o sal�rio do funcion�rio por pe�a
	private int pieces; //armazena o n�mero de pe�as produzidas

	
	//construtor
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber,
			double wage, int pieces)
	{
		super(firstName, lastName, socialSecurityNumber); //chamando o m�todo da classe Employee

		//tratamentos de exece��es remunera��o do funcion�rio e n�mero de pe�as produzidas
		if (wage < 0.0)
			throw new IllegalArgumentException
			("Wage must be >= 0");

		if (pieces < 0)
			throw new IllegalArgumentException
			("Number of pieces must be > 0");

		this.wage = wage;
		this.pieces = pieces;
	}

	// m�todos set e get
	public void setWage(double wage)
	{
		if (wage < 0.0) //define que o sal�rio n�o pode ser menor que zero, caso for ca� no tratamento de exece��o
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
		if (pieces < 0) //define o n�mero de pe�a, caso for menor que zero ca� no tratamemto de exece��o
			throw new IllegalArgumentException
			("Number of pieces must be > 0");

		this.pieces = pieces;
	} 

	
	public int getPieces()
	{
		return pieces;
	} 

	//Calcula os vencimentos do funcion�rio multiplicando o n�mero de pe�as produzido pelo sal�rio por pe�as
	@Override
	public double earnings() //sobrescrito
	{
		return getPieces() * getWage();
	}
	

	// M�todo toString sobrescrito
	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: $%,.2f%n%s: %d", "Pieceworker Employee",
				super.toString(), "Wage per piece", getWage(), "Pieces sold", getPieces());
	} 
}