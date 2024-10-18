package Practica_1;

import java.util.Scanner;

public class Practica_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido al Catálogo de Películas");
            System.out.println("1. Ver películas por género");
            System.out.println("2. Buscar película por nombre");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción de ver películas por género.");

                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción de buscar película por nombre.");

                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        }

        scanner.close();
        System.out.println("Gracias por usar el catálogo de películas.");
    }
}


