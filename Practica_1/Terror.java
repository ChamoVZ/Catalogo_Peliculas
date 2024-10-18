package Practica_1;

public class Terror extends Genero{
    public Terror() {
        super("Terror");
        agregarPelicula("IT");
        agregarPelicula("La Ouija");
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Genero:" + getNombre());
        System.out.println("Peliculas:" +String.join(", ", getPeliculas()));

    }
}
