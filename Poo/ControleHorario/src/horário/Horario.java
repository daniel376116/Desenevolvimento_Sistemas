package horário;

public class Horario {
	int hora, minuto, segundo;
	
	public Horario() {
		hora = 0;
		minuto = 0;
		segundo = 0;
	}
	
	public Horario(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	int calcularSegundos() {
		return hora * 3600 + minuto * 60 + segundo;
	}
	void exibir() {
		System.out.printf("Horário: %02d:%02d:%02d", hora, minuto, segundo);
		System.out.print("\nTotal em segundos: " + calcularSegundos()+"\n\n");
	}
}
