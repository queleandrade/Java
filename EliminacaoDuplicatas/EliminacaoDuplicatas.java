package EliminacaoDuplicatas;

import java.util.Scanner;

public class EliminacaoDuplicatas {

	public static void main(String[] args) {
		
		//criar um objeto Scanner para obten��o da entrada de dados
		Scanner sc = new Scanner (System.in);
		
		int valor; //declarando uma vari�vel do tipo inteiro
		
		//criando o array num
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) { //vai pecorrer 5 vezes os comandos abaixo
			System.out.println("Digite um n�mero: "); //solicita o n�mero ao usu�rio
			valor = sc.nextInt(); //o valor � armazenado na vari�vel
			if (valor >= 10 && valor <= 100) { //verifica se o n�mero digitado est� dentro do intervalo de 10 � 100
				num[i] = valor; // se tiver no intervalo armazena no array
				for(int j = 0; j < i; j++) { //definido para poder pecorrer o array que j� foi inserido o n�mero digitado pelo usu�rio
					if (valor==num[j]) { //caso o valor digitado seja igual ao que j� existe no array
						System.out.println("Esse voc� j� digitou"); //informa que j� existe
						i --; //faz o decremento, n�o ocupando um lugar no array
					}
					else { //caso o valor n�o seja igual, armazena no array
						num[i] = valor;
					}
				}
			}
			else { //caso o n�mero n�o esta dentro do intervalo de 10 � 100
				System.out.println("O n�mero n�o est� no intervalo 10 � 100"); //avisa ao usu�rio
				System.out.println("Digite outro n�mero:"); //solicita novamente
				valor = sc.nextInt();
				num[i] = valor;
			}
			for(int x: num) { //imprime o array toda vez que o usu�rio digita um n�mero
				System.out.println(x);
			}
		}
	}
}
	

