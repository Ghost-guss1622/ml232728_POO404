package Guia1;

import javax.swing.JOptionPane;

public class SumaEnteros {
    public static void main(String[] args) {
        String primernumero;
        String segundonumero;

        int numero1;
        int numero2;
        int suma;

        primernumero = JOptionPane.showInputDialog("Ingrese el primer numero");
        segundonumero = JOptionPane.showInputDialog("Ingrese el segundo numero");

        try {
            numero1 = Integer.parseInt(primernumero);
            numero2 = Integer.parseInt(segundonumero);

         if (numero1 < 0 || numero2 < 0){
       JOptionPane.showMessageDialog(null, "No se admiten numeros negativos");
         }else{
             suma = numero1 + numero2;
             JOptionPane.showMessageDialog(null, "La sumatoria total es: " + suma);
         }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese numeros enteros validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.exit(0);
    }
}
