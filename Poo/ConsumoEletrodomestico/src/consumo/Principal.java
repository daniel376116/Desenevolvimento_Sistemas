package consumo;

public class Principal {
	public static void main(String[] args) {

		Eletrodomestico eletrod = new Eletrodomestico();

		eletrod.nome = "Ventilador";
		eletrod.potenciaWatts = 100;
		eletrod.horasPorDia = 8;

		eletrod.exibirRelatorio(0.9);
	}
}