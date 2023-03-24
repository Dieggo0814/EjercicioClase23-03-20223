package PaqViviendas;

public abstract class Vivienda implements Comparable{
    protected double precio;
    protected double numerodeplantas;

    public Vivienda(double precio, double numerodeplantas) {
        this.precio = precio;
        this.numerodeplantas = numerodeplantas;
    }

    public double impuesto(){
        return 0.20 * this.precio;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Unifamiliar)) return 0;
        Unifamiliar x =(Unifamiliar) o;
        return Double.compare(this.impuesto(),x.impuesto());
    }
}
