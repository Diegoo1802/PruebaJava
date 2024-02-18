package Principal;

import java.util.Scanner;

import Clases.Cine;
import Clases.Peliculas;
import Clases.Sala;

public class MainCine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Cine cine = new Cine("CAMICINES VIGARA", 400, 6);

		cine.getSala(1).setPelicula(">> Torrente: El brazo tonto de la ley.");
		cine.getSala(2).setPelicula(">> Torrente 2: Mision en marbella.");
		cine.getSala(3).setPelicula(">> Torrente 3: El protector.");
		cine.getSala(4).setPelicula(">> Torrente 4: Lethal Crisis.");
		cine.getSala(5).setPelicula(">> Torrente 5: Operacion Eurovegas.");
		cine.getSala(6).setPelicula(">> Torrente 6: El regreso de Torrente." + "   "
				+ "29 DE FEBRERO ESTRENO EN EXCLUSIVA EN CAMICIES VIGARA...");

		int opcion;
		do {
			System.out.println("\n--- CAMICINES VIGARA ---");
			System.out.println("1. Ver peliculas disponibles");
			System.out.println("2. Reservar sala");
			System.out.println("3. Salir");
			System.out.print("Introduce la opcion deseada: ");

			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				cine.mostrarSalas();
				break;
			case 2:
				System.out.print("Introduce el numero de la sala que desea reservar o 0 para volver al menu: ");
				int numeroSala = scanner.nextInt();
				if (numeroSala != 0) {
					Sala salaSeleccionada = cine.getSala(numeroSala);
					if (salaSeleccionada != null) {
						System.out.println("Sala seleccionada: " + salaSeleccionada);
						salaSeleccionada.mostrarButacas();
						System.out.print("Introduce la fila y columna de la butaca que desea reservar (separados): ");
						int fila = scanner.nextInt();
						int columna = scanner.nextInt();
						System.out.print("Introduce su email para la confirmar la reserva: ");
						scanner.nextLine();
						String email = scanner.nextLine();
						salaSeleccionada.reservar(fila, columna, email);
						salaSeleccionada.mostrarButacas();
					} else {
						System.out.println("La sala seleccionada no existe");
					}
				}
				break;
			case 3:
				System.out.println("¡Gracias por venir a CAMICINES VIGARA! Esperamos verte pronto.");
				break;
			default:
				System.out.println("Opcion no valida. Por favor, Introduce una opcion valida.");
				break;
			}
		} while (opcion != 3); // Si la opcion es diferente a tres repetir opcion.

		scanner.close();
	}
}
