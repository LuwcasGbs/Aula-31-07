package aula3107;

import java.util.Scanner;
import java.util.ArrayList;

public class Arrayss1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int soma=0,num1,i=1;
		
		System.out.println("Digite 0 para sair..");
		
		while(i!=0) {
		i++;
		System.out.print("Insira um número inteiro: ");
		num1=ler.nextInt();
		lista.add(num1);
		soma=num1+soma;
		
		if (num1==0) {
			System.out.println(lista);
			System.out.println("A soma é "+soma+"!");
			break;
		}
	}
		ler.close();
		}
	}