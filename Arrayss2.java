package aula3107;

import java.util.Scanner;
import java.util.ArrayList;


public class Arrayss2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int num,i=1;
		
		System.out.println("Digite 0 para sair..");
		
		while(i!=0) {
			i++;
			System.out.print("Digite um número inteiro: ");
			num=ler.nextInt();
			if ((num%2)==0) {
				lista.add(num);
			}
			if (num==0) {
				break;
			}
		}
		System.out.println("Números pares:");
		System.out.println(lista);
		ler.close();
	}

}
