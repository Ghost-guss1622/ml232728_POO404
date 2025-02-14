package Constructores;

class Clase {
    static int contador;
    Clase() {
        contador ++;
    }

    int getContador(){
        return contador;
    }
}

public class Codigo {
   public static  void main (String[] args){
       Clase uno = new Clase();
       Clase dos = new Clase();
       Clase tres = new Clase();
       Clase cuatro = new Clase();

       System.out.println("Hemos declarado " + dos.getContador() + " objetos.");
   }
}
