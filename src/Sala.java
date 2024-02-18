public class Sala {
	private int numero;
	private String pelicula;
	private boolean[][] butacas;

	public Sala(int numero) {
		this.numero = numero;
		this.butacas = new boolean[10][15];
	}
	/**
	 * Con este metodo lo que hacemos es asignar las peliculas a una sala.
	 **/

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public String getPelicula() {
		return "Sala " + numero + ": Pelicula: " + pelicula;
	}
	
	/**
	 * Con este metodo lo que hacemos es reservar a traves del main
	 * la sala en la que deseamos ver la pelicula.
	 **/

	public boolean reservar(int fila, int columna, String email) {
		if (fila >= 1 && fila <= 10 && columna >= 1 && columna <= 10 && !butacas[fila - 1][columna - 1]) {
			butacas[fila - 1][columna - 1] = true;
			System.out.println("Reserva realizada para " + email + " en la fila " + fila + ", columna " + columna);
			return true;
		} else {
			System.out.println("La butaca seleccionada esta ocupada o no existe");
			return false;
		}
	}
	/**
	 * Con este metodo lo que hacemos es mostrar el array de butacas por consola a traves del main
	 * donde podemos ver si esta Ocupada [X] o sin ocupar [ ]
	 **/
	public void mostrarButacas() {
		System.out.println("Matriz de butacas de la Sala " + numero + ":");
		for (boolean[] fila : butacas) {
			for (boolean ocupada : fila) {
				if (ocupada) {
					System.out.print("[X]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}


}
