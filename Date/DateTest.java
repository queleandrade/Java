package Date;

public class DateTest {
	
	public static void main( String args[] )
	{
		System.out.println( "Verificando o incremento da data" );
		Date data = new Date( 8, 18, 1999 ); //cria o objeto data e j� adicionei o mes/dia/ano
		// incrementa 30 vezes dia, m�s e ano
		for ( int i = 0; i < 30; i++ )
		{
			data.nextDay(); //chama o m�todo nextDay
			System.out.printf( "Incremento da data: %s\n", data.toString() ); //imprime na tela as datas
		}
	} 
}
