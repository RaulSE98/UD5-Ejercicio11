import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el dia de la semana");
		dia = sc.next();
		
		switch (dia) {
			case "Lunes":
				System.out.println("Es un dia laborable");
				break;
			case "Martes":
				System.out.println("Es un dia laborable");
				break;
			case "Miercoles": 
				System.out.println("Es un dia laborable");
				break;
			case "Jueves":
				System.out.println("Es un dia laborable");
				break;
			case "Viernes": 
				System.out.println("Es un dia laborable");
				break;
			case "Sabado": 
				System.out.println("No es un dia laborable");
				break;
			case "Domingo":
				System.out.println("No es un dia laborable");
				break;
			default:
				System.out.println("No has introducido un dia");
		}

	}

}
