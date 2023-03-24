package PaqViviendas;

public class CasadeCampo extends Vivienda{
    private double metrosparcela;
    private Chalet chalet;

    public CasadeCampo(double precio, double numerodeplantas) {
        super(precio, numerodeplantas);
    }

    @Override
    public double impuesto() {
        return super.impuesto()+  0.5 * this.metrosparcela;
    }
}
