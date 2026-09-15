package copia;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		String nome;
		String continuar;
		
		do {
			System.out.println("Informe um nome: ");
			nome = input.nextLine();
			
			nomes.add(nome);
			
			System.out.println("Deseja adicionar outro nome? (Sim/Não) ");
			continuar = input.nextLine();
			
		} while (continuar.equalsIgnoreCase("Sim"));
		
		System.out.println("Nomes cadastrados:");
		
		for (String n : nomes) {
			System.out.println(n);
		}
		
		input.close();

	}

}
