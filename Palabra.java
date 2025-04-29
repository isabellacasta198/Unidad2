public class Palabra {
    String palabra;
    String significado;

    public Palabra(String palabra,String significado){
        this.palabra= palabra;
        this.significado= significado;

    }
    public String getPalabra(){
        return palabra;
    }
    public String getSignificado(){
        return significado;
    }
}
