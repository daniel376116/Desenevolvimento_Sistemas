package lampada;

public class App {

	public static void main(String[] args) {
		Lampada l1 = new Lampada("Philips", 4.50, 25, false);
		Lampada l2 = new Lampada("Kian", 3.60, 10, true);
		Lampada l3 = new Lampada("Kian", 4.60, 40, false);
		
		l1.exibirDados();
		l2.exibirDados();
		l3.exibirDados();
	}
}
