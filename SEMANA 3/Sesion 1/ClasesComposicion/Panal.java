package ClasesComposicion;

public class Panal {

    private String ubicacion;
    //Colección de abejas
    public Abeja[] enjambre;

    //El constructor de la clase NO RECIBE COMO ARGUMENTO la colección
    public Panal(String ubicacion) {
        this.ubicacion = ubicacion;
        this.enjambre = new Abeja[2];
        Abeja abeja1 = new Abeja("Abeja Reina");
        Abeja abeja2 = new Abeja("Abeja Obrera");
        this.enjambre[0] = abeja1;
        this.enjambre[1] = abeja2;
    }

    @Override
    public String toString() {
        for (int i = 0; i < this.enjambre.length; i++) {
            System.out.println("Id: " + this.enjambre[i].idAbeja
                    + "nombre: " + this.enjambre[i].nombre);
        }
        return "Panal{" + "ubicacion=" + ubicacion + '}';
    }

}
