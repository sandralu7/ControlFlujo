package co.com.controlesflujo;

public class ControlFlujoCase {

	public static void main(String[] args) {
		
		int dia = 7;
		String nombreDia;
		
		switch (dia) {
			case 1:
				nombreDia = "Lunes";
				break;
			case 2:
				nombreDia = "Martes";
				break;
			case 3: 
				nombreDia = "Miercoles";
				break;
			case 4: 
				nombreDia = "Jueves";
				break;
			case 5: 
				nombreDia = "Viernes";
				break;
			case 6:
				nombreDia = "Sábado";
				break;
			case 7:
				nombreDia = "Domingo";
				break;
			case 8:
				nombreDia = "Dia nuevo";
				break;
			default:
				nombreDia = "Día inválido";
				break;
				
		}
		System.out.println(nombreDia);

	}

}
