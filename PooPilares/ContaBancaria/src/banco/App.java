package banco;

public class App {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(1, "Carlos", 5000);
		ContaBancaria conta2 = new ContaBancaria(2, "Daniel", -25000);

		conta1.exibirDados();
		conta2.exibirDados();
		
		
		
		// System.out.println(conta1.saldo);
		
		// System.out.println(conta1.getSaldo());
		
		conta1.depositar(5000);
		conta1.consultarSaldo();
		// conta2.consultarSaldo();
		
	}

}
