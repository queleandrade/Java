package Computadores_na_educacao;
import java.security.SecureRandom;
import java.util.Scanner;

public class ProjetoCai {
	
	//objeto gerador de números aleatórios
	SecureRandom numAlet = new SecureRandom();
	
	//variavéis de instâncias
	private int respostaQuestaoAtual;
	private int qtdQuestoesRespondidas;
	private int qtdRespostasCorretas;
	
	
	//construtor Projetocai com três parâmetros
	public ProjetoCai(int respostaQuestaoAtual, int qtdQuestoesRespondidas, int qtdRespostasCorretas) {
		this.qtdQuestoesRespondidas = qtdQuestoesRespondidas;
		this.qtdRespostasCorretas = qtdRespostasCorretas;
		this.respostaQuestaoAtual = respostaQuestaoAtual;
	}
	
	//métodos
	//Geram até 10 questões de multiplicação, com valores aleatórios
	public void geraQuestao() {
		int num1 = 1 + numAlet.nextInt(10); //pega um número aleatório entre 0 e 9
		int num2 = 1 + numAlet.nextInt(10);
		this.respostaQuestaoAtual = num1*num2; //resposta correta
		System.out.printf("Quanto é %d x %d?", num1, num2);
	}

	//Avalia as respostas se está correto ou não
	public void avaliaResposta(int resposta) { 
		++qtdQuestoesRespondidas; //pré-incrementa a questão respondida

		if(resposta != respostaQuestaoAtual ) { // se a resposta inserida pelo usuário for diferente da resposta certa
			System.out.println(geraMensagem(false)); //gera uma mensagem de erro
		}
		else { //caso esteja certa a resposta inserida pelo usuário
			++qtdRespostasCorretas; //incrementa em resposta correta
			System.out.printf("%d%n", geraMensagem(true)); //gera mensagem dizendo que acertou
			
			if(qtdQuestoesRespondidas < 10) { // se ainda não tiver completado as 10 questões respondidas
				geraQuestao(); //vai gerar uma nova questão
			}
		}
		
		if(qtdQuestoesRespondidas >= 10) { //se tiver respondido as 10 questões
			double porcentagem = calculaPercentual(); //calcula o percentual de acerto
			
			System.out.printf("O percentual de acerto é: %.2f%n", porcentagem*100);//exibe para o usuário
			System.out.println("Parabéns, você está pronto para avançar para o próximo nível!"); //exibe como solicitado na questão
			
			if(porcentagem < 0.75) { //se o percentual de acerto for menor que 75%
				System.out.println("Peça ajuda extra ao seu professor."); //exibirá ao usuário
			}
		}
		
		qtdRespostasCorretas = 0;
		qtdQuestoesRespondidas = 0;
		geraQuestao(); //gera a questão novamente
	}

	
	//Gera a mensagem salientando se acertou ou errou
	public String geraMensagem(boolean respostaCerta) {
		int geraTrue = 1 + numAlet.nextInt(4); //sortea entre 0 e 3 números para as frases de acerto
		int geraFalse = 1 + numAlet.nextInt(4); //sortea entre 0 e 3 números para as frases de erro
		if(respostaCerta) { //se a resposta for certa
			switch(geraTrue) { //o numero sorteado em geraTrue vai retornar a frase
			case 0:
				return "Muito bom!";
			case 1:
				return "Excelente!";
			case 2:
				return "Bom trabalho!";
			case 3:
				return "Mantenha um bom trabalho!";
			}
		}else { //caso erre
			switch(geraFalse) { //o numero sorteado em geraFalse vai retornar a frase
			case 0:
				return "Não. Por favor, tente de novo.";
			case 1:
				return "Errado. Tente mais uma vez";
			case 2:
				return "Não desista!";
			case 3:
				return "Não. Continue tentando.";
			}
		}
		return null;
		
	}
	
	//calcula o percentual de acerto após 10 quetões respondidas
	public double calculaPercentual() {
		double percent = this.qtdRespostasCorretas/this.qtdQuestoesRespondidas; 
		return percent;
	}

	//métodos get e set
	
	public int getRespostaQuestaoAtual() {
		return respostaQuestaoAtual;
	}

	public void setRespostaQuestaoAtual(int respostaQuestaoAtual) {
		this.respostaQuestaoAtual = respostaQuestaoAtual;
	}

	public int getQtdQuestoesRespondidas() {
		return qtdQuestoesRespondidas;
	}

	public void setQtdQuestoesRespondidas(int qtdQuestoesRespondidas) {
		this.qtdQuestoesRespondidas = qtdQuestoesRespondidas;
	}

	public int getQtdRespostasCorretas() {
		return qtdRespostasCorretas;
	}

	public void setQtdRespostasCorretas(int qtdRespostasCorretas) {
		this.qtdRespostasCorretas = qtdRespostasCorretas;
	}
	
	
}
