public class Sala {
    private int numero;
    private Peliculas pelicula;
    private boolean[][] matrizButacas;
    /**
     * Pruebas de comentacion
     *
     *
     *
     * **/
    public Salas(int numero, Peliculas pelicula, int filas, int columnas) {
        this.numero = numero;
        this.pelicula = pelicula;
        this.matrizButacas = new boolean[filas][columnas];
    }

    public void reservarButaca(int fila, int columna, String emailComprador) {
        matrizButacas[fila][columna] = true;
        System.out.println("Butaca reservada en la fila " + fila + ", columna " + columna + " para " + emailComprador);
    }
    /**
     * Pruebas de comentacion
     *
     *
     *
     * **/
    public void verMatrizButacas() {
        System.out.println("Matriz de butacas para Sala " + numero);
        for (boolean[] fila : matrizButacas) {
            for (boolean butaca : fila) {
                System.out.print(butaca ? "X " : "O ");
            }
            System.out.println();
        }
    }
    /**
     * Pruebas de comentacion
     *
     *
     *
     * **/
    public int getNumero() {
        return numero;
    }
    /**
     * Pruebas de comentacion
     *
     *
     *
     * **/
    public Peliculas getPelicula() {
        return pelicula;
    }
}
