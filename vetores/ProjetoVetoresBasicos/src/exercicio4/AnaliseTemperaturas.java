package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double maiorTemp = 0;
		double menorTemp = 0;
		
		double[] temperaturas = new double[7];

		for (int i = 0; i < temperaturas.length; i++) {

			System.out.println("Informe a temperatura do " + (i + 1) + "º dia da semana: ");
			temperaturas[i] = Double.parseDouble(input.nextLine());
		}
		
		
		for (int j = 0; j < temperaturas.length; j++) {
			
			if (temperaturas[j] > maiorTemp) {
				maiorTemp = temperaturas[j];
			}
			
			 else if (temperaturas[j] < menorTemp) {
				
				menorTemp = temperaturas[j];
			}
			
			for (double temperatura : temperaturas) {
				System.out.println(temperatura);
			}
			
			System.out.println("Maior temperatura: " + maiorTemp);
			System.out.println("Menor Temperatura: " + menorTemp);
		}

	}
}
