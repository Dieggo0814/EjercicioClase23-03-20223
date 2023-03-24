package PaqViviendas;

public class Piso extends Vivienda{
    private boolean terraza;
    private double metrospiso;

    public Piso(double precio, double numerodeplantas, double metrospiso, boolean terraza) {
        super(precio, numerodeplantas);
        this.metrospiso = metrospiso;
        this.terraza = terraza;
    }

    @Override
    public double impuesto() {
        return 1.5 * this.metrospiso;
    }
}
