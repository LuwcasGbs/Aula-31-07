package aula3107;

import java.util.Scanner;

public class implementaerro {

	public static void main(String[] args) {
		int a,b,c;
		Scanner ler = new Scanner(System.in);
		a = 10;
		System.out.println("Digite um número: ");
		b=ler.nextInt();
		try {
			c = a/b;
			System.out.println("Valor de c: "+c);
		} catch (Exception erro) {
			System.out.println("Não existe divisão por zero!");
		}
		ler.close();
	}

}