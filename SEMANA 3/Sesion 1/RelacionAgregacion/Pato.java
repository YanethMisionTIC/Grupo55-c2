package RelacionAgregacion;


public class Pato {
    //1. Atributos
    protected int idPato;
    protected String nombre;
    protected static int contadorPatos;

    //2. Constructor de la clase con todos los args
    public Pato(String nombre) {
        this.nombre = nombre;
        this.idPato = ++Pato.contadorPatos;
    }
}
