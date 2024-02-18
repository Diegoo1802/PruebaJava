package Clases;

public class Cine {
	private String nombre;
	private int aforo;
	private Sala[] salas;

	public Cine(String nombre, int aforo, int numSalas) {
		this.nombre = nombre;
		this.setAforo(aforo);
		this.salas = new Sala[numSalas];
		for (int i = 0; i < numSalas; i++) {
			this.salas[i] = new Sala(i + 1);
		}
	}
/**
 * Con este metodo lo que hacemos es mostrar las salas disponibles 
 * y las imprimimos por consola llevando este metodo al main.
 **/
	public void mostrarSalas() {
		System.out.println("Salas disponibles en " + nombre + ":");
		for (Sala sala : salas) {
			System.out.println(sala);
		}
	}
	/**
	 * Con este metodo lo que hacemos es asignar cada sala.
	 **/
	public Sala getSala(int numeroSala) {
		if (numeroSala >= 1 && numeroSala <= salas.length) {
			return salas[numeroSala - 1];
		} else {
			return null;
		}
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

}
