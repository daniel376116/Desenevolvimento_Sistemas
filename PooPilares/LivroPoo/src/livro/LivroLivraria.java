package livro;

public class LivroLivraria extends Livro {
	private int numeroPaginas;
	private int anoLancamento;

	public LivroLivraria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivroLivraria(String titulo, String autor, String editora, double preco, int numeroPaginas,
			int anoLancamento) {
		super(titulo, autor, editora, preco);
		this.numeroPaginas = numeroPaginas;
		this.anoLancamento = anoLancamento;

	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	@Override
	void exibirDados() {
		super.exibirDados();
		System.out.println("Número de páginas: "+ numeroPaginas);
		System.out.println("Ano de lançamento: "+ anoLancamento);
	}
	

}
