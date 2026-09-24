package banco;

public class ContaBancaria {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public ContaBancaria() {
	}

	public ContaBancaria(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		if (saldo >= 0) {
			
			this.saldo = saldo;
		} else {
			saldo = 0;
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
		this.saldo = saldo;
		} else {
			saldo = 0;
		}
	}

	void exibirDados() {
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Cliente: " + nome);
		System.out.println(saldo > 0 ? "Saldo da conta: " + saldo + "\n" : "Saldo: valor inválido\n");
	}
	
	void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println(valor + " R$ depositado com sucesso!");
		} else {
			System.out.println("Valor inválido");
		}
	}
	
	void sacar (double valor) {
		if (valor > 0 && saldo > valor) {
			saldo -= valor;
		}  else if (valor > saldo) {
			System.out.println("Saldo insufisciente");
		} else {
			System.out.println("Valor solicitado é inválido");
		}
	}
	
	void consultarSaldo() {
		System.out.printf("Saldo: %.2f" , saldo);
	}

}
