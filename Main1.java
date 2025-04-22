public class Main1 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregarContacto("Carlos", 123456);
        agenda.agregarContacto("Ana", 654321);
        agenda.agregarContacto("Luis", 789012);

        System.out.println("Todos los contactos:");
        agenda.mostrarContactos();

        String buscar = "Carlos";
        Contacto encontrado = agenda.buscarContacto(buscar);
        if (encontrado != null) {
            System.out.println("\nContacto encontrado - Nombre: " + encontrado.nombre + ", Teléfono: " + encontrado.telefono);
        } else {
            System.out.println("\nContacto '" + buscar + "' no encontrado.");
        }
    }
}
