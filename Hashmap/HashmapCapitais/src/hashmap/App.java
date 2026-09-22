package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		HashMap<String, String> capitais = new HashMap<>();

		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("Espírito Santo", "Vitória");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");
		capitais.put("São Paulo", "São Paulo");

		String estado, resposta;

		do {
			System.out.println("Informe um estado brasileiro registrado: ");
			estado = input.nextLine();

			if (capitais.containsKey(estado)) {
				System.out.println("Capital do estado " + estado + ": " + capitais.get(estado));
			} else {
				System.out.println("Estado não registrado");
			}

			System.out.println("\nDesejas continuar buscando? (Sim/Não)");
			resposta = input.nextLine();
		} while (resposta.equalsIgnoreCase("Sim"));

	}

}
