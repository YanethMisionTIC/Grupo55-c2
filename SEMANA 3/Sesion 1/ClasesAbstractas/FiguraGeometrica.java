package ClasesAbstractas;

public abstract class FiguraGeometrica {
    //1. Atributo: tipoFigura
    protected String tipoFigura;
    protected int idFigura;
    protected static int contadorFiguras;
    
    //2. Añadimos el constructor de la clase con todos los args
    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
        this.idFigura = ++FiguraGeometrica.contadorFiguras;
    }
    
    //3. Método dibujarFigura
    /*
        El método se implementa en la clase hijo NO ACÁ
        public void dibujarFigura(){... Aquí van las instrucciones}
    */
    public abstract void dibujarFigura();
    public abstract void calcularAreaFigura();
    
    
}
