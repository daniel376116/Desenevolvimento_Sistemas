package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> tarefas = new ArrayList<>();
		String tarefa;
		String continuar;
		
		do {
			System.out.println("Cadastre uma tarefa:");
			tarefa = input.nextLine();
			
			tarefas.add(tarefa);
			
			System.out.println("Deseja continuar cadastrando? (Sim/Não)");
			continuar = input.nextLine();
			
		} while(continuar.equalsIgnoreCase("Sim"));
		
		System.out.println("\nTarefas cadastradas:\n ");
		
		for (String t: tarefas) {
			System.out.println(t);
		}
		
		input.close();
	}

}
