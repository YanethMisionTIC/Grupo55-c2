package RelacionAgregacion;

public class Lago {
    //1. Atributos
    private String nombreLago;
    private String ubicacion;
    //2. Generamos la relación con la clase Pato
    //En esta colección cada pato que se añada debe tener un id y un nombre
    public Pato[] patos;

    
    //3.1. Añadimos el constructor vacío de la clase
    public Lago() {
    }

    //3. Añadimos el constructor de la clase con todos los args
    public Lago(String nombreLago, String ubicacion, Pato[] patos) {
        this.nombreLago = nombreLago;
        this.ubicacion = ubicacion;
        this.patos = patos;
    }
    
    //4. Añadimos la función toString para mostrar la info del objeto Lago

    @Override
    public String toString() {
        //5. el atributo patos es una colección
        //for (int i = 0; i <= this.patos.length-1; i++) {
        for (int i = 0; i < this.patos.length; i++) {
            System.out.println("Id: " + this.patos[i].idPato
                               + ", nombre: " + this.patos[i].nombre);
        }
        
        return "Lago{" + "nombreLago=" + nombreLago 
                + ", ubicacion=" + ubicacion 
                + '}';
    }
    
}
