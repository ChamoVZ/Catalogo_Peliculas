package Practica_1;

public class Romance extends Genero{

    public Romance() {
        super("Romance");
        agregarPelicula("Titanic");
        agregarPelicula("Un amor imposible");
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Genero:" + getNombre());
        System.out.println("Peliculas:" +String.join(", ", getPeliculas()));

    }
}


