package exrcicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		double somaNotas = 0;
		Scanner input = new Scanner(System.in);

		double[] notas = new double[4];

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Informe a " + (i + 1) + "ª nota: ");
			notas[i] = Double.parseDouble(input.nextLine());

			somaNotas = somaNotas + notas[i];
		}

		System.out.println("Notas cadastradas:\n");

		for (int j = 0; j < notas.length; j++) {

			System.out.print(notas[j] + "\n");

		}

		System.out.println("Média da turma: " + somaNotas / notas.length);

	}

}
