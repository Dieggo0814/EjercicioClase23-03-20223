package PaqViviendas;

public class Chalet extends Unifamiliar{
    private double metrosjardin;


    public Chalet(double precio, double numerodeplantas, double metrosjardin) {
        super(precio, numerodeplantas);
        this.metrosjardin=metrosjardin;
    }
}
