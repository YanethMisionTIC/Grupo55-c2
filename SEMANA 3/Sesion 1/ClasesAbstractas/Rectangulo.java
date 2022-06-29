package ClasesAbstractas;

public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Forma de dibujar el rectangulo... Explicación.");
    }

    @Override
    public void calcularAreaFigura() {
        System.out.println("Fórmula");
    }
}
