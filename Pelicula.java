package practica;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String codigo;
    private String nombre;
    private Categoria categoria;
    private List<Actor> actores;

    //contructor:
    public Pelicula(String codigo, String nombre, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.actores = new ArrayList<>();
    }


    public void agregarActor(Actor actor) {
        actores.add(actor);
    }
    //lista de actores de la pelicula
    public List<Actor> getActores() {
        return actores;
    }
    public boolean esAptaParaMenores() {
        return !categoria.getNombre().equals("Terror") && !categoria.getNombre().equals("Suspenso") &&
                !categoria.getNombre().equals("Acción");
    }
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Pelicula: " + nombre + " (Código: " + codigo + "), Categoría: " +
                categoria.getNombre() + ", Apta para menores: " +
                (esAptaParaMenores() ? "Sí es apta para menores" : "No es apta para menores") + "\nActores:\n");
        for (Actor actor : actores) {
            info.append("- ").append(actor.getNombre()).append(" (").append(actor.getNacionalidad()).append(")\n");
        }
        return info.toString();
   }
}
