package PaqViviendas;

public class CasadeCampo extends Vivienda{
    private double metrosparcela;
    private Chalet chalet;

    public CasadeCampo(double precio, double numerodeplantas, double metrosparcela, Chalet chalet) {
        super(precio, numerodeplantas);
        this.metrosparcela = metrosparcela;
        this.chalet = chalet;
    }

    @Override
    public double impuesto() {
        return super.impuesto()+ 0.5 * this.metrosparcela;
    }
}
