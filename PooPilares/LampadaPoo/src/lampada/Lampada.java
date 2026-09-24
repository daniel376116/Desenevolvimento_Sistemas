package lampada;

public class Lampada {
	private String marca;
	private double preco;
	private double potencia;
	private boolean estadoLampada;
	
	
	public Lampada() {
		
	}

	public Lampada(String marca, double preco, double potencia, boolean estadoLampada) {
		this.marca = marca;
		this.preco = preco;
		this.potencia = potencia;
		this.estadoLampada = estadoLampada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	boolean mostrarEstado() {
		if (estadoLampada) {
			return true;
		} else {
			return false;
		}
	}

	void exibirDados() {
		System.out.print(marca + " - R$ " + preco + " - " + potencia + " watts (potência)"+ (mostrarEstado()?" - ligada\n" : " - desligada\n"));
	}
}
