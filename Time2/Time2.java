package Time2;

//Fig. 8.5: Time2.java
//Classes com contrutores sobrecarregados

public class Time2
{
	private int hour; // variável de instância de horas
	private int minute; ///variável de instância de minutos
	private int second; // variável de instância de segundo

	// Time2 o contrutor não possui argumento e inicializa as variavéis de instância como zero
	public Time2()
	{
		this(0, 0, 0); // chama o contrutor com os 3 argumentos
	} 

	// Nesse construtor fornece a hora e os minutos, segundos padronizados como zero
	public Time2(int hour) 
	{ 
		this(hour, 0, 0); // chama o contrutor com os 3 argumentos
	} 

	// Nesse construtor fornece a hora e o minuto, os segundos padronizados como zero
	public Time2(int hour, int minute) 
	{ 
		this(hour, minute, 0); // chama o contrutor com os 3 argumentos
	} 

	// Nesse construtor fornece a hora, minuto e segundos
	public Time2(int hour, int minute, int second) 
	{ 
		if (hour < 0 || hour >= 24) //se a hora for menor que  zero e maior ou igual que 24 vai lançar um erro de exceção com a mensagem
			throw new IllegalArgumentException("A hora deve ser 0-23");

		if (minute < 0 || minute >= 60) //se o minuto for menor que  zero e maior ou igual que 60 vai lançar um erro de exceção com a mensagem
			throw new IllegalArgumentException("Os minutos deve ser 0-59");

		if (second < 0 || second >= 60)  //se o segundo for menor que  zero e maior ou igual que 60 vai lançar um erro de exceção com a mensagem
			throw new IllegalArgumentException("Os secundos deve ser 0-59");

		this.hour = hour;
		this.minute = minute; 
		this.second = second; 
	} 

	// Nesse construtor fornece outro objeto 
	public Time2(Time2 time)
	{
		// Chama os construtores com 3 argumentos
		this(time.getHour(), time.getMinute(), time.getSecond());
	} 
 
	// Definir os métodos e um novo valor de hora usando a hora universal, e valida os dados
	public void setTime(int hour, int minute, int second)
	{
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("A hora deve ser 0-23"); //se a hora for menor que  zero e maior ou igual que 24 vai lançar um erro de exceção com a mensagem

		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Os minutos deve ser 0-59"); //se o minuto for menor que  zero e maior ou igual que 60 vai lançar um erro de exceção com a mensagem

		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("Os secundos deve ser 0-59"); //se o segundo for menor que  zero e maior ou igual que 60 vai lançar um erro de exceção com a mensagem

		this.hour = hour;
		this.minute = minute; 
		this.second = second; 
	} 

	// validar e definir a hora 
	public void setHour(int hour) 
	{ 
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("A hora deve ser 0-23");

		this.hour = hour;
	} 

	// validar e definir minuto 
	public void setMinute(int minute) 
	{ 
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Os minutos deve ser 0-59");

		this.minute = minute; 
	} 

	// validar e definri segundos 
	public void setSecond(int second) 
	{ 
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("Os secundos deve ser 0-59");

		this.second = second; 
	} 

	//Métodos get e set
	public int getHour() 
	{ 
		return hour; 
	} 

	public int getMinute() 
	{ 
		return minute; 
	} 

	public int getSecond() 
	{ 
		return second; 
	} 
	
	// Incrementando um segundo
	public void tick()
	{
		setSecond( second + 1 );
	
		if ( second == 0) {
			incrementMinute();
		}
	} 
	
	// Incrementando um minuto
	public void incrementMinute()
	{
		setMinute( minute + 1 );
	
		if ( minute == 0 )
			incrementHour();
	 }
	
	 // Incrementando uma hora
	public void incrementHour()
	 {
		setHour( hour + 1 );
	 }

	// Convertendo a hora para o formato de hora universal (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format(
				"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	} 

	// Convertendo a hora para o formato padrão (H:MM:SS AM or PM)
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", 
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	} 
} 

