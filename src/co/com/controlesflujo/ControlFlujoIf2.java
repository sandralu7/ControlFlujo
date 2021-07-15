package co.com.controlesflujo;

public class ControlFlujoIf2 {

	public static void main(String[] args) {
	
		double nota = 20;
		
		if(nota >= 0 && nota <= 1) {
			System.out.println("Deficiente");
		}else if (nota > 1 && nota <= 3) {
			System.out.println("Insuficiente");
		}else if (nota > 3 && nota <= 4) {
			System.out.println("Bueno");
		}else if (nota > 4 && nota <= 5) {
			System.out.println("Excelente");
		} else {
			System.out.println("Nota inválida");
		}
		

	}

}
