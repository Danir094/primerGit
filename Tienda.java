package practica;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Pelicula> peliculasTienda;
    public Tienda() {
        this.peliculasTienda = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculasTienda.add(pelicula);
    }
    public List<Pelicula> getPeliculas() {
        return peliculasTienda;
    }
    public List<Pelicula> obtenerPeliculasAptasPorNacionalidadActor(String nacionalidad) {
        List<Pelicula> peliculasAptas = new ArrayList<>();
        for (Pelicula pelicula : peliculasTienda) {
            if (pelicula.esAptaParaMenores()) {
                for (Actor actor : pelicula.getActores()) {
                    if (actor.getNacionalidad().equals(nacionalidad)) {
                        peliculasAptas.add(pelicula);
                        break;
                    }
                }
            }
        }
        return peliculasAptas;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        for (Pelicula pelicula : peliculasTienda) {
            info.append(pelicula).append("\n");
        }
        return info.toString();
    }
}
