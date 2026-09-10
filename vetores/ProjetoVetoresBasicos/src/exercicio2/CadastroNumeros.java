package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Informe o " + (i+1) + "º " + "número: ");
			numeros[i] = input.nextInt();
		}
		
		System.out.println("Números cadastrados:\n");
		
		for(int j = 0; j < numeros.length; j++) {
			
			System.out.print(numeros[j] + "\n\n") ;
		}
	}

}
