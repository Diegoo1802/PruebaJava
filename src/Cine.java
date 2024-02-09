import java.util.ArrayList;

public class Cine {
    private String nombre;
    private int aforo;
    private ArrayList<Sala> salas;

    public Cine(String nombre, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = new ArrayList<>();
    }

    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    public void verSalas() {
        System.out.println("Salas disponibles en " + nombre + ":");
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.getNumero() + ": Película: " + sala.getPelicula().getTitulo() + ", Duración: " + sala.getPelicula().getDuracion() + " minutos");
        }
    }
}
