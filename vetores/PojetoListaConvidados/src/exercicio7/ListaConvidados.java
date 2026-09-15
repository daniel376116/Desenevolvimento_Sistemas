package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> convidados = new ArrayList<>();
		String nomeConvidado;
		int opcao;
		int posicao;
		do {
			System.out.println(
					"" + "1 - Adicionar convidado\r\n" + "2 - Alterar convidado\r\n" + "3 - Remover convidado\r\n"
							+ "4 - Procurar convidado\r\n" + "5 - Exibir convidados\r\n" + "6 - Encerrar");
			opcao = Integer.parseInt(input.nextLine());

			switch (opcao) {
			case 1:
				System.out.println("Nome do convidado:");
				nomeConvidado = input.nextLine();
				convidados.add(nomeConvidado);
				break;

			case 2:
				System.out.println("Informe o nome do convidado:");
				nomeConvidado = input.nextLine();
				
				System.out.println("Informe a posição que desejas colocá-lo:");
				posicao = Integer.parseInt(input.nextLine());

				convidados.set(posicao - 1, nomeConvidado);
				break;

			case 3:
				System.out.println("Qual convidado queres remover? ");
				nomeConvidado = input.nextLine();

				convidados.remove(nomeConvidado);
				break;

			case 4:
				System.out.println("Qual convidado queres encontrar?");
				nomeConvidado = input.nextLine();

				if (convidados.indexOf(nomeConvidado) >= 0) {

					System.out.println("Posição: " + convidados.indexOf(nomeConvidado));

				} else {

					System.out.println("Convidado não cadastrado");
				}
				break;

			case 5:
				for (String convidado : convidados) {
					System.out.println("Convidados: " + convidado);
				}
				break;

			case 6:
				System.out.println("Programa encerrado");

				break;

			default:
				System.out.println("Opção inválida!");
			}
			
		} while (opcao != 6);

	}

}
