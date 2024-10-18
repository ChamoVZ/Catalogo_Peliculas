package Practica_1;

public class Pelicula {
    private String titulo;
    private int anio;
    private int duracion;

    public Pelicula(String titulo, int anio, int duracion) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracion = duracion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("----------------------------");
    }
}

