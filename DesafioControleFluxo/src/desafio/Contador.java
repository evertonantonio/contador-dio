package desafio;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor para intera��o");
		int primeiro = entrada.nextInt();
		System.out.println("Digite o segundo valor para intera��o");
		int segundo = entrada.nextInt();
		
		while(primeiro > segundo) {
			System.out.println("Primeiro valor tem que ser menor que o segundo");
			System.out.println("===============================================================");
			System.out.println("Digite o primeiro valor para intera��o");
			primeiro = entrada.nextInt();
			System.out.println("Digite o segundo valor para intera��o");
			segundo = entrada.nextInt();
		}
		
		int interacao = segundo - primeiro;
		
		for(int i = 0; i < interacao; i++) {
			System.out.println("Imprimindo n�mero " + (i + 1));
		}
	}

}
