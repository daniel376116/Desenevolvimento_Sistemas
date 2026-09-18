package consumo;

public class Eletrodomestico {

	String nome;
	double potenciaWatts, horasPorDia;

	public Eletrodomestico() {
		nome = "";
		potenciaWatts = 0.0;
		horasPorDia = 0.0;

	}

	double consumoDiarioWh() {
		return potenciaWatts * horasPorDia;
	}

	double consumoMensalWh() {
		return consumoDiarioWh() * 30;
	}

	double consumoAnualWh() {
		return consumoMensalWh() * 12;
	}

	double gastoMensal(double precoKwh) {
		return consumoMensalWh() / 1000 * precoKwh;
	}

	void exibirRelatorio(double precoKwh) {
		System.out.printf("Aparelho: %s - Potência: %.1f w - Consumo diário: %.1f h%n", nome, potenciaWatts, horasPorDia);
		System.out.printf(
				"Diário: %.2f w%nMensal: %.2f w%nAnual: %.2f w%n",
				consumoDiarioWh(), consumoMensalWh(), consumoAnualWh());
		System.out.printf("Tarifa: %.2f%nCusto mensal: %.2f", precoKwh, gastoMensal(precoKwh));
	}
}
