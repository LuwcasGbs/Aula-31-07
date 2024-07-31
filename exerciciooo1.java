package aula3107;

import java.util.ArrayList;

public class exerciciooo1 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Alice");
		nomes.add("Bob");
		nomes.add("Charlie");
		
		try {
		System.out.println("Nome: "+nomes.get(5));
		}
		catch(Exception erro) {
			System.out.println("Indique a posição corrreta ou..");
			System.out.println("Indique o índice corretamente");
		}
	}

}
