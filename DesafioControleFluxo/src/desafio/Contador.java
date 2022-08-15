package desafio;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor para interação");
		int primeiro = entrada.nextInt();
		System.out.println("Digite o segundo valor para interação");
		int segundo = entrada.nextInt();
		
		while(primeiro > segundo) {
			System.out.println("Primeiro valor tem que ser menor que o segundo");
			System.out.println("===============================================================");
			System.out.println("Digite o primeiro valor para interação");
			primeiro = entrada.nextInt();
			System.out.println("Digite o segundo valor para interação");
			segundo = entrada.nextInt();
		}
		
		int interacao = segundo - primeiro;
		
		for(int i = 0; i < interacao; i++) {
			System.out.println("Imprimindo número " + (i + 1));
		}
	}

}
