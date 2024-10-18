package Practica_1;
import java.util.ArrayList;
import java.util.List;

public abstract class Genero {
    private String nombre;
    private List<String> peliculas;

    public Genero(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula(String pelicula) {
        peliculas.add(pelicula);
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getPeliculas() {
        return peliculas;
    }


    public abstract void mostrarInformacion();
}

