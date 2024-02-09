import java.util.ArrayList;

public class Cine {
    private String nombre;
    private int aforo;
    private ArrayList<Sala> salas;
    /**
     * Pruebas de comentacion
     *
     *
     *
     * **/
    public Cine(String nombre, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = new ArrayList<>();
    }
    /**
     * Pruebas de comentacion
     *
     *
     *
     * **/
    public void agregarSala(Sala sala) {
        salas.add(sala);
    }
    /**
     * Pruebas de comentacion
     *
     *
     *
     * **/
    public void verSalas() {
        System.out.println("Salas disponibles en " + nombre + ":");
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.getNumero() + ": Película: " + sala.getPelicula().getTitulo() + ", Duración: " + sala.getPelicula().getDuracion() + " minutos");
        }
    }
}
