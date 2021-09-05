package Date;

public class DateAndTime {
	private int mes; // vari�vel de inst�ncia do m�s
	private int dia; // vari�vel de inst�ncia do dia
	private int ano; // vari�vel de inst�ncia do ano
	private int horas; //vari�vel de inst�ncia de horas
	private int minuto; //vari�vel de inst�ncia de minutos
	private int segundos; //vari�vel de inst�ncia de segundos

	// construtor
	public DateAndTime( int mes, int dia, int ano,
			int horas, int minuto, int segundos )
	{
		setDate( mes, dia, ano);
		setTempo( horas, minuto, segundos );
	} 

	//defini��es, verifica��es e valida��es de valores
	public void setDate( int mes, int dia, int ano )
	{
		this.mes = verificaMes( mes ); // validar� m�s com base no m�todo verificaMes
		this.ano = verificaAno( ano ); // validar� ano com base no m�todo verificaAno
		this.dia = verificaDia( dia ); // validar� dia com base no m�todo verificaDia
	} 
	
	// Definir� o novo valor da hora, minuto e segundos
	public void setTempo( int h, int m, int s )
	{

		setHora( h ); // valida��o da hora
		setMinuto( m ); // valida��o do minuto
		setSegundo( s ); // valida��o do segundo
	} 

	// definindo o intervalo da hora
	public void setHora( int h )
	{
		horas = ( ( h >= 0 && h < 24 ) ? h : 0 );
	}

	// definindo o intervalo dos minutos
	public void setMinuto( int m )
	{
		minuto = ( ( m >= 0 && m < 60 ) ? m : 0 );
	} 

	// definindo o intervalo dos segundos
	public void setSegundo( int s )
	{
		segundos = ( ( s >= 0 && s < 60 ) ? s : 0 );
	}

	//M�todo get
	public int getHoras()
	{
		return horas;
	} 

	public int getMinuto()
	{
		return minuto;
	} 

	public int getSegundos()
	{
		return segundos;
	} 

	// Incrementa os segundos
	public void tick()
	{
		setSegundo( segundos + 1 );

		if ( segundos == 0 )
			incrementaMinuto();
	} 
	
	// Incrementa os minutos
	public void incrementaMinuto()
	{

		setMinuto( minuto + 1 );

		if ( minuto == 0 )
			incrementaHora();
	} 

	// Incrementa as horas
	public void incrementaHora()
	{
		setHora( horas + 1 );

		if ( horas == 0 )
			nextDay();
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

	// Convertendo a hora para o formato de hora universal (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format( "%d/%d/%d: %02d:%02d:%02d",
				mes, dia, ano, getHoras(), getMinuto(), getSegundos() );
	} 

	//  Convertendo a hora para o formato padr�o (H:MM:SS AM or PM)
	public String toString()
	{
		return String.format( "%d/%d/%d: %d:%02d:%02d %s",
				mes, dia, ano,
				( (getHoras() == 0 || getHoras() == 12) ? 12 : getHoras() % 12 ),
				getMinuto(), getSegundos(), ( getHoras() < 12 ? "AM" : "PM" ) );
	} 
} 

