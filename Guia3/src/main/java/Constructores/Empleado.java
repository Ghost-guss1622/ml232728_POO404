package Constructores;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre;
    private String apellido;

    public void mostrardatos(){
        JOptionPane.showConfirmDialog(null, nombre + " " + apellido);
    }

    public void ingresardatos(){
        nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido= JOptionPane.showInputDialog("Ingrese el Apellido");
    }

}

class Profesor extends Empleado{
    int sueldo;

    public void mostrar2(){
        mostrardatos();
        JOptionPane.showMessageDialog(null, sueldo);
    }

    public void ingreso2(){
        ingresardatos();
        String s=JOptionPane.showInputDialog("Ingrese el sueldo");
        sueldo = Integer.parseInt(s);
    }
}

