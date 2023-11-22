package practica;

public class Actor {


    private String nombre;
    private String nacionalidad;

    //Contructor:
    public Actor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    //metodos gett
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getNombre() {
        return nombre;
    }

    //TOString
    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

}
