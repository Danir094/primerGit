package practica;

public class Categoria {
    private String codigo;
    private String nombre;

    //contructor:
    // throws: excepciones incluye el IF:
    public Categoria(String codigo, String nombre) throws CategoriaInvalidaException {
        if (!nombre.equals("Terror") && !nombre.equals("Suspenso") && !nombre.equals("Acción") &&
                !nombre.equals("Comedia") && !nombre.equals("Animación")) {
            throw new CategoriaInvalidaException("Categoría inválida");
        }
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Categoria{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
