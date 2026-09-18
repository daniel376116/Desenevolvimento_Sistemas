package academia;

public class AlunoAcademia {

	String nome;
	int idade;
	double peso, altura;

	public AlunoAcademia(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	double calcularIMC() {
		return peso / (altura * altura);
	}

	String ehMenorDeIdade() {
		return (idade < 18 ? "Sim" : "Não");
	}

	void mostrarDados() {
		System.out.printf(
				"Nome: %s%nIdade: %d%nPeso: %.1f KG%nAltura: %.2f m%nÉ menor de idade? %s%nTem direito ao desconto? %s%nIMC: %.2f%n%n",
				nome, idade, peso, altura, ehMenorDeIdade(), ehMenorDeIdade(), calcularIMC());
	}
}
