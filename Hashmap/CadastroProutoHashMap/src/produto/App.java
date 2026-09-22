package produto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		HashMap<Integer, Produto> produtos = new HashMap<>();

		produtos.put(1, new Produto("Arroz", 12.50, 9600));
		produtos.put(2, new Produto("Feijão", 9.50, 9700));
		produtos.put(3, new Produto("Abóbora", 7.15, 550));
		produtos.put(4, new Produto("Picanha", 79.99, 1000));
		
		for (Map.Entry<Integer, Produto> prod : Produto.entrySet()) {
			System.out.println("Produto: " + prod.getKey() + " | Quantidade: " + prod.getValue());
		}
	}

}
