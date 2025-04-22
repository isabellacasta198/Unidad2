public class Contacto {
    String nombre;
    int telefono;
    Contacto left, right;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.left = null;
        this.right = null;
    }
}
