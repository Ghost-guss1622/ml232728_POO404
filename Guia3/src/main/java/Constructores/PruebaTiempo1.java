package Constructores;
import javax.swing.JOptionPane;

public class PruebaTiempo1 {
    public static void main(String arg[])
    {
    Tiempo1 tiempo = new Tiempo1();

    String salida = "La hora universal inicial es: " + tiempo.aStringUniversal() + "\n La hora estandar inicial es: " + tiempo.aStringEstandar();
     tiempo.establecerHora(13,27, 6);

     salida += "\n\n La hora universal después de establecerHora es: " + tiempo.aStringUniversal() + "\n La hora estándar después de establecerHora es: " + tiempo.aStringEstandar();

     tiempo.establecerHora(99,99, 99);

     salida += "\n\n Después de intentar ajustes inválidos: " + "\nHora universal: " + tiempo.aStringUniversal() + "\n Hora estándar: " + tiempo.aStringEstandar();

     JOptionPane.showMessageDialog(null, salida, "Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE);

     System.exit(0);

    }
}
