package Date;

import java.util.Scanner;

public class DateAndTimeTest
{
	public static void main( String args[] ) {
		Scanner sc = new Scanner( System.in );
		
		//Pede as informações ao usuário

		System.out.println( "Digite a data e horário" );
		System.out.print( "Mês: " );
		int mes = sc.nextInt();
		System.out.print( "Dia: " );
		int dia = sc.nextInt();
		System.out.print( "Ano: " );
		int ano = sc.nextInt();

		System.out.print( "Horas: " );
		int horas = sc.nextInt(); 
		System.out.print( "Minutos: " );
		int minuto = sc.nextInt();
		System.out.print( "Segundos: " );
		int segundos = sc.nextInt();
		
		//cria o objeto dataHora

		DateAndTime dataHora = new DateAndTime(
				mes, dia, ano, horas, minuto, segundos );

		int validacao = getMenuValidacao(); //chamando o método static

		while ( validacao != 6 ) //caso o usário digite 6, sai do programa
		{
			switch ( validacao )
			{
			case 1: // para adicionar um segundo
				dataHora.tick();
				break;

			case 2: // para adicionar um minuto
				dataHora.incrementaMinuto();
				break;

			case 3: // para adicionar uma hora
				dataHora.incrementaHora();
				break;

			case 4: // para adicionar um dia
				dataHora.nextDay();
				break;

			case 5: // para adicionar um mês
				dataHora.nextMonth();
				break;
			} 


			System.out.printf( "Hora e data universal: %s\n",
					dataHora.toUniversalString() );
			System.out.printf( "Hora e data padrão: %s\n",
					dataHora.toString() );

			validacao = getMenuValidacao();
		}
	} 

	// Mostra o menu e retorna o valor corresponde a escolha
	private static int getMenuValidacao()
	{
		Scanner sc = new Scanner( System.in );

		System.out.println( "1. Para adicionar 1 segundo" );
		System.out.println( "2. Para adicionar 1 minuto" );
		System.out.println( "3. Para adicionar 1 hora" );
		System.out.println( "4. Para adicionar 1 dia" );
		System.out.println( "5. Para adicionar 1 mês" );
		System.out.println( "6. Exit" );
		System.out.print( "Digite o número: " );

		return sc.nextInt();
	}
} 