package Time2;

import java.util.Scanner;

public class Time2Test 
{
	public static void main(String[] args)
	{
		// obtendo as entradas a partir do Scanner
		Scanner sc = new Scanner(System.in);
		
		//criação dos objetos Time2
		Time2 t1 = new Time2(); 

		//Solicitando o horário ao usuário 
		System.out.println("Entre com o horário");
		System.out.println("Horas: ");
		t1.setHour( sc.nextInt() );
		System.out.println( "Minutos: " );
		t1.setMinute( sc.nextInt() );
		System.out.println( "Segundos: " );
		t1.setSecond( sc.nextInt() );

		int selecione = menuSelecao(); //chamando o método static

		while ( selecione != 4 ) //se for igual a 4, o programa finaliza
		{
			switch ( selecione )
			{
			case 1: // adiciona 1 segundo
				t1.tick();
				break;

			case 2: // adiciona 1 minuto
				t1.incrementMinute();
				break;

			case 3: // adiciona 1 hora
				t1.incrementHour();
				break;
			}

			//imprime na tela o horário ja incrementado ao usuário
			System.out.printf( "Hora: %d Minuto: %d Segundo: %d\n",
					t1.getHour(), t1.getMinute(), t1.getSecond() );
			System.out.printf( "Hora universal: %s Horário padrão: %s\n",
					t1.toUniversalString(), t1.toString() );


			selecione = menuSelecao();
		} 
	}

	// Mostra o menu e retorna o valor corresponde a escolha
	private static int menuSelecao( )
	{
		Scanner sc = new Scanner( System.in );

		System.out.println( "1.Para adicionar 1 segundo" );
		System.out.println( "2. Para adicionar 1 minuto" );
		System.out.println( "3. Para adicionar 1 hora" );
		System.out.println( "4. Sair" );
		System.out.print( "Diga a opção: " );

		return sc.nextInt();
	} 

} 

