package Constructores;

import javax.swing.*;

public class Persona {

    private String nombre;
    private String apellido;
    private String edad;

    public Persona(){
        nombre = "Rafael";
        apellido = "Torres";
        edad = "23";
    }

    public Persona(String nombre, String apellido, String edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public void ingresoDatos(){
        nombre= JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        edad = JOptionPane.showInputDialog("Ingrese su edad");
    }

    public void mostrarDatos(){
        System.out.println("Su Nombre es: " +nombre);
        System.out.println("Su Apellido es: " + apellido);
        System.out.println("Su edad es: " +edad);
        System.out.println("***************************************");
    }

    public static void main(String args[]){
        Persona obj1 = new Persona();
        Persona obj2 = new Persona("Manuel", "Valdez", "25");
        obj1.mostrarDatos();
        obj1.ingresoDatos();
        obj1.mostrarDatos();
        obj2.mostrarDatos();
        obj2.apellido="Sanchez";
        obj2.mostrarDatos();
    }
}
