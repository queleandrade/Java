package Date;

//Aprimorando a classe Date e para ilustrar que o método funcionará corretamente, incrementei para próximo mês e ano
//Tive a curiosidade de testar os casos como pedido no livro na questão 8.8
//código feito com base na figura 8.7

public class Date
{
	private int mes; // variável de instância do mês
	private int dia; // variável de instância do dia
	private int ano; // variável de instância do ano

	//construtor
	public Date( int mes, int dia, int ano )
	{
		this.mes = verificaMes( mes ); // validará mês com base no método verificaMes
		this.ano = verificaAno( ano ); // validará ano com base no método verificaAno
		this.dia = verificaDia( dia ); // validará dia com base no método verificaDia
		System.out.printf("Data inserida no construtor: %s \n", toString());
	} 

	// Método que válida o ano
	private int verificaAno( int validaAno )
	{
		if ( validaAno > 0 ) // O ano necessita ser maior que zero
			return validaAno; //retorna o ano
		else // caso contrário, informa ao usuário que o ano é inválido e retorna o valor 1, que é incrementado e mantendo o objeto em estado consistente
		{
			System.out.printf(
					"Ano %d inválido \n", validaAno );
			return 1;
		} 
	} 

	// Método que válida o mês
	private int verificaMes( int validaMes )
	{
		if ( validaMes > 0 && validaMes <= 12 ) // Verifica se o mês está no intervalo de 1 - 12
			return validaMes;
		else //Caso contrário, diz que inseriu um número inválido e retorna o valor 1, que é incrementado e mantendo o objeto em estado consistente
		{
			System.out.printf(
					"Mês %d inválido \n", validaMes );
			return 1; 
		} 
	} 
	
	// Método que válida o dia com base no mês e ano
	private int verificaDia( int validaDia )
	{
		int daysPerMonth[] =
			{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Verifica se o dia está no intervalo dos dias do mês
		if ( validaDia > 0 && validaDia <= daysPerMonth[ mes ] )
			return validaDia;

		// Verifica no ano bissexto se o mês é 2 e o dia é 29
		if ( mes == 2 && validaDia == 29 && ( ano % 400 == 0 ||
				( ano % 4 == 0 && ano % 100 != 0 ) ) )
			return validaDia;

		System.out.printf( "Dia %d inválido \n", validaDia ); //caso não esteja entre as verificações acima, retorna inválido

		return 1; 
	} 

	// Irá incrementar o dia e também verifica se o dia mudará de mês
	public void nextDay()
	{
		int validaDia = dia + 1; //incrementa

		if ( verificaDia( validaDia ) == validaDia ) //verifica se o dia está nas condições do método verificaDia, caso sim, o dia é valido
			dia = validaDia; 
		else // caso contrário, assume o dia como um, mantendo o objeto consistente
		{
			dia = 1;
			nextMonth(); //chama o método mês
		} 
	}
	
	// Irá incrementar o mês e também verifica se mudará de ano
	public void nextMonth()
	{
		if ( 12 == mes ) // se o mês for igual a 12 (dezembro), incrementa para o próximo ano
			ano++;

		mes = mes % 12 + 1; //incrementa o mês
	} 

	// Retorna a data no formato mês/dia/ano
	public String toString()
	{
		return String.format( "%d/%d/%d",mes, dia, ano);
	} 
} 

