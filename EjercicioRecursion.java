public class EjerciciosRecursion {
    public static void main(String[] args) {
        fun_recursiva(0);
    }

    static void fun_recursiva(int i) {
        if (i >= 10) { // Condición de parada para evitar un StackOverflowError
            return;
        }
        System.out.println("Llamado " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        fun_recursiva(i + 1);
    }
}

// Se recomienda colocar esta clase en un archivo separado llamado "RecursionVocales.java"
class RecursionVocales {
    // Método recursivo para contar las vocales en una cadena
    public static int contarVocales(String str, int index) {
        if (index == str.length()) {
            return 0;
        }
        char c = Character.toLowerCase(str.charAt(index));
        int count = ("aeiou".indexOf(c) != -1) ? 1 : 0;
        return count + contarVocales(str, index + 1);
    }

    // Método de inicio que llama a la recursión
    public static int contarVocales(String str) {
        return contarVocales(str, 0);
    }

    // Método principal para probar el código
    public static void main(String[] args) {
        String texto = "Hola, este es un ejemplo de recursión";
        int cantidad = contarVocales(texto);
        System.out.println("Cantidad de vocales: " + cantidad);
    }
}
