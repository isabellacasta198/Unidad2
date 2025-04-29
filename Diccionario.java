import java.util.ArrayList;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Palabra> listaPalabras = new ArrayList<>();
        ArbolBST arbol = new ArbolBST();
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar palabra y significado");
            System.out.println("2. Buscar significado");
            System.out.println("3. Mostrar diccionario (ordenado)");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la palabra: ");
                    String palabra = scanner.nextLine();
                    System.out.print("Ingresa el significado: ");
                    String significado = scanner.nextLine();
                    Palabra nuevaPalabra = new Palabra(palabra, significado);
                    listaPalabras.add(nuevaPalabra);
                    arbol.insertar(nuevaPalabra);
                    break;

                case 2:
                    System.out.print("Ingresa la palabra a buscar: ");
                    String buscar = scanner.nextLine();
                    Palabra resultado = arbol.buscar(buscar);
                    if (resultado != null) {
                        System.out.println("Significado: " + resultado.getSignificado());
                    } else {
                        System.out.println("La palabra no se encuentra en el diccionario.");
                    }
                    break;

                case 3:
                    System.out.println("\nDiccionario en orden alfabético:");
                    arbol.inOrden();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
