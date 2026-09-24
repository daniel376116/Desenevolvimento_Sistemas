package livro;

public class App {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Livraria Garnier", 180.0);
		LivroLivraria livroLivraria1 = new LivroLivraria("1984", "George Orwell", "Secker & Warburg", 179.9, 336, 1949);
		
		livro1.exibirDados();
		livroLivraria1.exibirDados();
		

	}

}
