package Practica_1;

    public class Accion extends Genero{

        public Accion(){
            super("Accion");
            agregarPelicula("Mad Max; Fury Road");
            agregarPelicula("Jhon Wick");
        }
        @Override
        public void mostrarInformacion() {
            System.out.println("Genero: " + getNombre());
            System.out.println("Peliculas: " + String.join(",", getPeliculas()));


        }

    }

