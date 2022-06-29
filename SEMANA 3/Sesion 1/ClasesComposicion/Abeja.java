package ClasesComposicion;


public class Abeja {
    protected int idAbeja;
    protected String nombre;
    protected static int contadorAbejas;

    public Abeja(String nombre) {
        this.nombre = nombre;
        this.idAbeja = ++Abeja.contadorAbejas;
    }
}
