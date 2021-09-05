package Date;

public class DateTest {
	
	public static void main( String args[] )
	{
		System.out.println( "Verificando o incremento da data" );
		Date data = new Date( 8, 18, 1999 ); //cria o objeto data e já adicionei o mes/dia/ano
		// incrementa 30 vezes dia, mês e ano
		for ( int i = 0; i < 30; i++ )
		{
			data.nextDay(); //chama o método nextDay
			System.out.printf( "Incremento da data: %s\n", data.toString() ); //imprime na tela as datas
		}
	} 
}
