package Guia1;
import javax.swing.JOptionPane;
public class Comparacion {
    public static void main(String[] args) {
        String primernumero;
        String segundonumero;
        String resultado;

        int numero1;
        int numero2;

        primernumero = JOptionPane.showInputDialog("Escriba el primer número entero");
        segundonumero = JOptionPane.showInputDialog("Escriba el segundo número entero");

        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);

        resultado ="";
        if (numero1 == numero2) {
            resultado = resultado + numero1 + "==" + numero2;
        }
        if (numero1 != numero2) {
            resultado = resultado + numero1 + "!=" + numero2;
        }
        if (numero1 < numero2) {
            resultado = resultado + "\n" + numero1 + "<" + numero2;
        }
        if (numero1 > numero2) {
            resultado = resultado + "\n" + numero1 + ">" + numero2;
        }
        if (numero2 <= numero1) {
            resultado = resultado + "\n" + numero2 + "<=" + numero1;
        }
        if (numero2 >= numero1) {
            resultado = resultado + "\n" + numero2 + ">=" + numero1;
        }
        JOptionPane.showConfirmDialog(null, resultado, "Resultado de la comparación es", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
