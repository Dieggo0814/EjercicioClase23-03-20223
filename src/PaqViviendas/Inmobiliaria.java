package PaqViviendas;

public class Inmobiliaria {
    private int indice=0;
    private Vivienda[] v;
    private int n;
    public Inmobiliaria(int n){
        v=new Vivienda[n];
    }
   public void incluir(Vivienda v){
           this.v[indice]=v;
           indice++;
   }
   /*//Encontrar huecos
   public void huecoLibres(){
       for (int i = 0; i < this.v.length; i++) {
           if(this.v[i] == null){
               this.v[i]=v;
           }
       }
   }
   */
    public void dimeNoChalets(){

    }

}
