package academia;

public class Principal {

	public static void main(String[] args) {

		AlunoAcademia aluno1 = new AlunoAcademia("Ana", 17, 60.0, 1.65);
		AlunoAcademia aluno2 = new AlunoAcademia("Bruno", 25, 78.0, 1.80);

		aluno1.mostrarDados();
		aluno2.mostrarDados();
	}

}
