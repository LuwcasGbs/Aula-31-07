package aula3107;

import java.util.Scanner;

public class Exerciciooo4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		try {
		System.out.println("Escolha um número entre 1 e 3: ");
		int numero = ler.nextInt();
		switch (numero) {
			case 1: 
				System.out.println("O número escolhido foi: 1.");
				break;
			case 2:
				System.out.println("O número escolhido foi: 2.");
				break;
			case 3:
				System.out.println("O número escolhido foi: 3.");
				break;
				
			default:
				System.out.println("O número escolhido inválido! Digite um número entre 1 e 3.");
			}
		} catch (Exception erro) {
			System.out.println("Insira um número real!!!");
		}
		ler.close();
	}

}
