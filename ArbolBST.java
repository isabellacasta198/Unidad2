public class ArbolBST {
    Nodo raiz;

    public ArbolBST() {
        raiz = null;
    }

    public void insertar(Palabra palabra) {
        raiz = insertarRec(raiz, palabra);
    }

    private Nodo insertarRec(Nodo raiz, Palabra palabra) {
        if (raiz == null) {
            raiz = new Nodo(palabra);
            return raiz;
        }
        if (palabra.getPalabra().compareToIgnoreCase(raiz.dato.getPalabra()) < 0) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, palabra);
        } else if (palabra.getPalabra().compareToIgnoreCase(raiz.dato.getPalabra()) > 0) {
            raiz.derecho = insertarRec(raiz.derecho, palabra);
        }
        return raiz;
    }

    public Palabra buscar(String palabra) {
        return buscarRec(raiz, palabra);
    }

    private Palabra buscarRec(Nodo raiz, String palabra) {
        if (raiz == null) {
            return null;
        }
        if (palabra.equalsIgnoreCase(raiz.dato.getPalabra())) {
            return raiz.dato;
        }
        if (palabra.compareToIgnoreCase(raiz.dato.getPalabra()) < 0) {
            return buscarRec(raiz.izquierdo, palabra);
        } else {
            return buscarRec(raiz.derecho, palabra);
        }
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(Nodo raiz) {
        if (raiz != null) {
            inOrdenRec(raiz.izquierdo);
            System.out.println(raiz.dato.getPalabra() + ": " + raiz.dato.getSignificado());
            inOrdenRec(raiz.derecho);
        }
    }
}
