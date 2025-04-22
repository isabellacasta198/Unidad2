public class Agenda {
    private Contacto raiz;

    // Agregar contacto
    public void agregarContacto(String nombre, int telefono) {
        raiz = insertar(raiz, new Contacto(nombre, telefono));
    }

    private Contacto insertar(Contacto actual, Contacto nuevo) {
        if (actual == null) {
            return nuevo;
        }
        if (nuevo.nombre.compareToIgnoreCase(actual.nombre) < 0) {
            actual.left = insertar(actual.left, nuevo);
        } else {
            actual.right = insertar(actual.right, nuevo);
        }
        return actual;
    }

    // Buscar contacto
    public Contacto buscarContacto(String nombre) {
        return buscar(raiz, nombre.toLowerCase());
    }

    private Contacto buscar(Contacto actual, String nombre) {
        if (actual == null || actual.nombre.equalsIgnoreCase(nombre)) {
            return actual;
        }
        if (nombre.compareToIgnoreCase(actual.nombre) < 0) {
            return buscar(actual.left, nombre);
        } else {
            return buscar(actual.right, nombre);
        }
    }

    // Mostrar todos los contactos (inorden)
    public void mostrarContactos() {
        inorden(raiz);
    }

    private void inorden(Contacto actual) {
        if (actual != null) {
            inorden(actual.left);
            System.out.println("Nombre: " + actual.nombre + ", Teléfono: " + actual.telefono);
            inorden(actual.right);
        }
    }
}
