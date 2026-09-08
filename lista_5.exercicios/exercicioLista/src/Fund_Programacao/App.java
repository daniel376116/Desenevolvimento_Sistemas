package exercicios;

public class App {

	public static void main(String[] args) {
		
		String numero1 = "10";
		String numero2 = "5";
		String numero3 = "12.50";
		
		System.out.println(numero1 + numero2);
		
		System.out.println(Integer.parseInt(numero1) + Integer.parseInt(numero2));
		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		
		System.out.print("Soma: ");
		System.out.println( n1 + n2);
		System.out.print("Subtração: ");
		System.out.println(n1 - n2);
		System.out.print("Multiplicação: ");
		System.out.println(n1 * n2);
		
		String preco = "12.50";
		double precoConvertido = Double.parseDouble(preco);
		
		System.out.println("Preço original: "+ preco);
		
		System.out.print("Preço após o aumento: ");
		System.out.println(precoConvertido + 5);
	}
}
