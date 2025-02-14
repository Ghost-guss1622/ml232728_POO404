package Constructores;

import javax.swing.JOptionPane;

public class pruebaempleado {

        public static void main(String[] args){
            Empleado emp = new Empleado();
            Profesor pro = new Profesor();
            JOptionPane.showMessageDialog(null, "claseempleado");

            emp.ingresardatos();
            emp.mostrardatos();

            JOptionPane.showMessageDialog(null, "clase profesor");

            pro.ingreso2();
            pro.mostrar2();
        }
}
