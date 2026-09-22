package hashmapEstoque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> estoque = new HashMap<>();

		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Placa de vídeo", 10);
		estoque.put("SSD", 5);

		for (Map.Entry<String, Integer> estoq : estoque.entrySet()) {
			System.out.println("Produto: " + estoq.getKey() + " | Quantidade: " + estoq.getValue());
		}

		System.out.println("\n--- Exibir quantidade ---\nInforme o nome do produto: ");
		String nome = input.nextLine();

		if (estoque.containsKey(nome)) {
			System.out.println("Quantidade: " + estoque.get(nome));
		} else {
			System.out.println("Produto não registrado");
		}

		System.out.println("--- Alterar estoque ---\n Produto: ");
		String nomeProduto = input.nextLine();

		if (estoque.containsKey(nomeProduto)) {
			System.out.println("Informe a quantidade nova:");
			int quantidade = Integer.parseInt(input.nextLine());

			estoque.put(nomeProduto, quantidade);
		} else {
			System.out.println("Produto não registrado");
		}

		System.out.println("--- Remover produto ---\n Produto: ");
		String removePrdt = input.nextLine();

		if (estoque.containsKey(removePrdt)) {
			estoque.remove(removePrdt);
			System.out.println("Produto remomovido com sucesso!\n");
		} else {
			System.out.println("Produto não encontrado\n");
		}

		for (Map.Entry<String, Integer> estoq : estoque.entrySet()) {
			System.out.println("Produto: " + estoq.getKey() + " | Quantidade: " + estoq.getValue());
		}
	}

}
