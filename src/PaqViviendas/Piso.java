package PaqViviendas;

public class Piso extends Vivienda{
    private boolean terraza;
    private int metrospiso;

    public Piso(double precio, double numerodeplantas, int metrospiso) {
        super(precio, numerodeplantas);
        this.metrospiso = metrospiso;
    }

    @Override
    public double impuesto() {
        return 1.5 * this.metrospiso;
    }
}
