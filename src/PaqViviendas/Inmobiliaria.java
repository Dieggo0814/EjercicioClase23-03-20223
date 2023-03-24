package PaqViviendas;

public class Inmobiliaria {
    private int indice=0;
    private int cont=0;
    private Vivienda[] v;
    private int n;
    public Inmobiliaria(int n){
        v=new Vivienda[n];
    }
   public void incluir(Vivienda v){

           this.v[indice]=v;
           indice++;

   }
   public int cuentaUni(){

       for (int i = 0; i < n; i++) {
           if (!(v[n] instanceof Chalet)) {
               cont++;
           }
       }
       return cont;
   }
}
