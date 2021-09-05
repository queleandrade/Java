package Date;

//Aprimorando a classe Date e para ilustrar que o m�todo funcionar� corretamente, incrementei para pr�ximo m�s e ano
//Tive a curiosidade de testar os casos como pedido no livro na quest�o 8.8
//c�digo feito com base na figura 8.7

public class Date
{
	private int mes; // vari�vel de inst�ncia do m�s
	private int dia; // vari�vel de inst�ncia do dia
	private int ano; // vari�vel de inst�ncia do ano

	//construtor
	public Date( int mes, int dia, int ano )
	{
		this.mes = verificaMes( mes ); // validar� m�s com base no m�todo verificaMes
		this.ano = verificaAno( ano ); // validar� ano com base no m�todo verificaAno
		this.dia = verificaDia( dia ); // validar� dia com base no m�todo verificaDia
		System.out.printf("Data inserida no construtor: %s \n", toString());
	} 

	// M�todo que v�lida o ano
	private int verificaAno( int validaAno )
	{
		if ( validaAno > 0 ) // O ano necessita ser maior que zero
			return validaAno; //retorna o ano
		else // caso contr�rio, informa ao usu�rio que o ano � inv�lido e retorna o valor 1, que � incrementado e mantendo o objeto em estado consistente
		{
			System.out.printf(
					"Ano %d inv�lido \n", validaAno );
			return 1;
		} 
	} 

	// M�todo que v�lida o m�s
	private int verificaMes( int validaMes )
	{
		if ( validaMes > 0 && validaMes <= 12 ) // Verifica se o m�s est� no intervalo de 1 - 12
			return validaMes;
		else //Caso contr�rio, diz que inseriu um n�mero inv�lido e retorna o valor 1, que � incrementado e mantendo o objeto em estado consistente
		{
			System.out.printf(
					"M�s %d inv�lido \n", validaMes );
			return 1; 
		} 
	} 
	
	// M�todo que v�lida o dia com base no m�s e ano
	private int verificaDia( int validaDia )
	{
		int daysPerMonth[] =
			{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Verifica se o dia est� no intervalo dos dias do m�s
		if ( validaDia > 0 && validaDia <= daysPerMonth[ mes ] )
			return validaDia;

		// Verifica no ano bissexto se o m�s � 2 e o dia � 29
		if ( mes == 2 && validaDia == 29 && ( ano % 400 == 0 ||
				( ano % 4 == 0 && ano % 100 != 0 ) ) )
			return validaDia;

		System.out.printf( "Dia %d inv�lido \n", validaDia ); //caso n�o esteja entre as verifica��es acima, retorna inv�lido

		return 1; 
	} 

	// Ir� incrementar o dia e tamb�m verifica se o dia mudar� de m�s
	public void nextDay()
	{
		int validaDia = dia + 1; //incrementa

		if ( verificaDia( validaDia ) == validaDia ) //verifica se o dia est� nas condi��es do m�todo verificaDia, caso sim, o dia � valido
			dia = validaDia; 
		else // caso contr�rio, assume o dia como um, mantendo o objeto consistente
		{
			dia = 1;
			nextMonth(); //chama o m�todo m�s
		} 
	}
	
	// Ir� incrementar o m�s e tamb�m verifica se mudar� de ano
	public void nextMonth()
	{
		if ( 12 == mes ) // se o m�s for igual a 12 (dezembro), incrementa para o pr�ximo ano
			ano++;

		mes = mes % 12 + 1; //incrementa o m�s
	} 

	// Retorna a data no formato m�s/dia/ano
	public String toString()
	{
		return String.format( "%d/%d/%d",mes, dia, ano);
	} 
} 

