package academia;

public class AlunoAcademia {

	String nome;
	int idade;
	double peso;
	double altura;

	public AlunoAcademia(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public static boolean eMenorDeIdade(int idade) {
		if (idade < 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double imc(double peso, double altura) {
		return peso / (altura * altura);
	}
	
	void mostrarDados() {
		System.out.println("Nome: "  + nome);
	}
}
