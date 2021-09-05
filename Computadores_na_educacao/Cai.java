package Computadores_na_educacao;

import java.util.Scanner;
public class Cai {

	public static void main(String[] args) {
		
		int respostaQuestaoAtual = 0;
		int qtdQuestoesRespondidas = 0;
		int qtdRespostasCorretas = 0;
		//criar um objeto Scanner para obten��o da entrada de dados
		Scanner sc = new Scanner(System.in);
		
		//cria o objeto
		ProjetoCai escola = new ProjetoCai(respostaQuestaoAtual, qtdQuestoesRespondidas, qtdRespostasCorretas);
		
		int resposta; //declara uma vari�vel
		System.out.println("Caso queria que o programa se encerre digite -1");
		
		escola.geraQuestao(); //chama o m�todo de gerar a quest�o 
		
		resposta = sc.nextInt(); //armazena na variav�l resposta
		
		while(resposta != -1) { //equanto for diferentede -1, se for -1 o programa finaliza
			escola.avaliaResposta(resposta); //avaliar se a resposta esta certa ou errada
			
			System.out.println("Resposta:"); 
			resposta = sc.nextInt();
		}
	}
}
