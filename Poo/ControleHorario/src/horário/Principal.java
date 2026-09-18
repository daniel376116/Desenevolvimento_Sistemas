package horário;

public class Principal {

	public static void main(String[] args) {
		Horario horario1 = new Horario();
		
		horario1.exibir();
		
		horario1.hora = 8;
		horario1.minuto = 15;
		horario1.segundo = 30;
		
		horario1.exibir();
		
		Horario horario2 = new Horario(14, 20, 05);
		
		horario2.exibir();
	}

}
