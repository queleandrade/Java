package EliminacaoDuplicatas;

import java.util.Scanner;

public class EliminacaoDuplicatas {

	public static void main(String[] args) {
		
		//criar um objeto Scanner para obtenção da entrada de dados
		Scanner sc = new Scanner (System.in);
		
		int valor; //declarando uma variável do tipo inteiro
		
		//criando o array num
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) { //vai pecorrer 5 vezes os comandos abaixo
			System.out.println("Digite um número: "); //solicita o número ao usuário
			valor = sc.nextInt(); //o valor é armazenado na variável
			if (valor >= 10 && valor <= 100) { //verifica se o número digitado está dentro do intervalo de 10 à 100
				num[i] = valor; // se tiver no intervalo armazena no array
				for(int j = 0; j < i; j++) { //definido para poder pecorrer o array que já foi inserido o número digitado pelo usuário
					if (valor==num[j]) { //caso o valor digitado seja igual ao que já existe no array
						System.out.println("Esse você já digitou"); //informa que já existe
						i --; //faz o decremento, não ocupando um lugar no array
					}
					else { //caso o valor não seja igual, armazena no array
						num[i] = valor;
					}
				}
			}
			else { //caso o número não esta dentro do intervalo de 10 à 100
				System.out.println("O número não está no intervalo 10 à 100"); //avisa ao usuário
				System.out.println("Digite outro número:"); //solicita novamente
				valor = sc.nextInt();
				num[i] = valor;
			}
			for(int x: num) { //imprime o array toda vez que o usuário digita um número
				System.out.println(x);
			}
		}
	}
}
	

