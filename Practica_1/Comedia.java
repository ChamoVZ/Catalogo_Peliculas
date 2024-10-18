package Practica_1;

public class Comedia extends Genero {

    public Comedia() {
        super("Comedia");
        agregarPelicula("Son como niños");
        agregarPelicula("Ser o no ser");

    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Genero: " + getNombre());
        System.out.println("Peliculas" + String.join(",", getPeliculas()));

    }
}