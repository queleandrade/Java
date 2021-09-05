package Computadores_na_educacao;
import java.security.SecureRandom;
import java.util.Scanner;

public class ProjetoCai {
	
	//objeto gerador de n�meros aleat�rios
	SecureRandom numAlet = new SecureRandom();
	
	//variav�is de inst�ncias
	private int respostaQuestaoAtual;
	private int qtdQuestoesRespondidas;
	private int qtdRespostasCorretas;
	
	
	//construtor Projetocai com tr�s par�metros
	public ProjetoCai(int respostaQuestaoAtual, int qtdQuestoesRespondidas, int qtdRespostasCorretas) {
		this.qtdQuestoesRespondidas = qtdQuestoesRespondidas;
		this.qtdRespostasCorretas = qtdRespostasCorretas;
		this.respostaQuestaoAtual = respostaQuestaoAtual;
	}
	
	//m�todos
	//Geram at� 10 quest�es de multiplica��o, com valores aleat�rios
	public void geraQuestao() {
		int num1 = 1 + numAlet.nextInt(10); //pega um n�mero aleat�rio entre 0 e 9
		int num2 = 1 + numAlet.nextInt(10);
		this.respostaQuestaoAtual = num1*num2; //resposta correta
		System.out.printf("Quanto � %d x %d?", num1, num2);
	}

	//Avalia as respostas se est� correto ou n�o
	public void avaliaResposta(int resposta) { 
		++qtdQuestoesRespondidas; //pr�-incrementa a quest�o respondida

		if(resposta != respostaQuestaoAtual ) { // se a resposta inserida pelo usu�rio for diferente da resposta certa
			System.out.println(geraMensagem(false)); //gera uma mensagem de erro
		}
		else { //caso esteja certa a resposta inserida pelo usu�rio
			++qtdRespostasCorretas; //incrementa em resposta correta
			System.out.printf("%d%n", geraMensagem(true)); //gera mensagem dizendo que acertou
			
			if(qtdQuestoesRespondidas < 10) { // se ainda n�o tiver completado as 10 quest�es respondidas
				geraQuestao(); //vai gerar uma nova quest�o
			}
		}
		
		if(qtdQuestoesRespondidas >= 10) { //se tiver respondido as 10 quest�es
			double porcentagem = calculaPercentual(); //calcula o percentual de acerto
			
			System.out.printf("O percentual de acerto �: %.2f%n", porcentagem*100);//exibe para o usu�rio
			System.out.println("Parab�ns, voc� est� pronto para avan�ar para o pr�ximo n�vel!"); //exibe como solicitado na quest�o
			
			if(porcentagem < 0.75) { //se o percentual de acerto for menor que 75%
				System.out.println("Pe�a ajuda extra ao seu professor."); //exibir� ao usu�rio
			}
		}
		
		qtdRespostasCorretas = 0;
		qtdQuestoesRespondidas = 0;
		geraQuestao(); //gera a quest�o novamente
	}

	
	//Gera a mensagem salientando se acertou ou errou
	public String geraMensagem(boolean respostaCerta) {
		int geraTrue = 1 + numAlet.nextInt(4); //sortea entre 0 e 3 n�meros para as frases de acerto
		int geraFalse = 1 + numAlet.nextInt(4); //sortea entre 0 e 3 n�meros para as frases de erro
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
				return "N�o. Por favor, tente de novo.";
			case 1:
				return "Errado. Tente mais uma vez";
			case 2:
				return "N�o desista!";
			case 3:
				return "N�o. Continue tentando.";
			}
		}
		return null;
		
	}
	
	//calcula o percentual de acerto ap�s 10 quet�es respondidas
	public double calculaPercentual() {
		double percent = this.qtdRespostasCorretas/this.qtdQuestoesRespondidas; 
		return percent;
	}

	//m�todos get e set
	
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
