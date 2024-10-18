package Practica_1;

public class Suspenso extends Genero  {
    public Suspenso() {
        super("Suspenso");
        agregarPelicula("Psicosis");
        agregarPelicula("El Regreso");

    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Genero:" + getNombre());
        System.out.println("Peliculas:" +String.join(", ", getPeliculas()));


    }
}
