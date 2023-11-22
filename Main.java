package practica;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Categoria accion = new Categoria("001", "Acción");
            Categoria comedia = new Categoria("002", "Comedia");
            Categoria animacion = new Categoria("003", "Animación");



            Pelicula pelicula1 = new Pelicula("P001", "Pelicula Acción 1", accion);
            pelicula1.agregarActor(new Actor("Actor 1", "EEUU"));
            pelicula1.agregarActor(new Actor("Actor 2", "Canadá"));
            pelicula1.agregarActor(new Actor("Actor 3", "EEUU"));

            Pelicula pelicula2 = new Pelicula("P002", "Pelicula Comedia 1", comedia);
            pelicula2.agregarActor(new Actor("Actor 4", "Reino Unido"));
            pelicula2.agregarActor(new Actor("Actor 5", "Australia"));

            Pelicula pelicula3 = new Pelicula("P003", "Pelicula Animación 1", animacion);
            pelicula3.agregarActor(new Actor("Actor 6", "Francia"));
            pelicula3.agregarActor(new Actor("Actor 7", "Alemania"));


            Tienda tienda = new Tienda();
            tienda.agregarPelicula(pelicula1);
            tienda.agregarPelicula(pelicula2);
            tienda.agregarPelicula(pelicula3);

            System.out.println("Películas en la Tienda:");
            System.out.println(tienda);

            System.out.println("Películas aptas para menores con actores de EEUU:");
            List<Pelicula> peliculasEEUU = tienda.obtenerPeliculasAptasPorNacionalidadActor("EEUU");
            for (Pelicula pelicula : peliculasEEUU) {
                System.out.println(pelicula);
            }

        } catch (CategoriaInvalidaException e) {
            System.err.println(e.getMessage());
        }
    }
}