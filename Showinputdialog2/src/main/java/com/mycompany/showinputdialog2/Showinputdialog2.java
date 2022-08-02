package com.mycompany.showinputdialog2;
import javax.swing.*;
public class Showinputdialog2 {
    
    public static void main(String[] args) {
        Object seleccion= JOptionPane.showInputDialog(null, "Seleccione una opcion", "Selecciones su estado civil", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Casado/a","Soltero/a","Divorciado/a","otro"},"Otro");
        System.out.println("El usuario ha elegido "+ seleccion);
    }
}
