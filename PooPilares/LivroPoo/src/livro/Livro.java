package livro;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private double preco;

	public Livro() {
	}

	public Livro(String titulo, String autor, String editora, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	void exibirDados() {
		System.out.println("\nTítulo: "+ titulo);
		System.out.println("Autor: "+ autor);
		System.out.println("Editora: "+ editora);
		System.out.println("preco: R$"+ preco);
	}

}
