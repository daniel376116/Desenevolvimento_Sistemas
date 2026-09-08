package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		if (numero > 20) {
			System.out.println("Número maior que 20");
		}
		else {
			System.out.println("Número menor que 20 ou igual a 20");
		}
	}

}
