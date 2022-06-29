package ClasesAbstractas;


public class Circulo extends FiguraGeometrica{

    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    //Por sobreescritura llamo el método abstracto
    @Override
    public void dibujarFigura() {
        System.out.println("Forma de dibujar el circulo... Explicación.");
    }

    @Override
    public void calcularAreaFigura() {
         System.out.println("Fórmula");
    }
}
