package com.mycompany.showoptiondialog;
import javax.swing.*;
public class ShowOptiondialog {
    
    public static void main(String[] args) {
        int seleccion =JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"opcion 1", "opcion 2", "opcion 3"}, "opcion 2");
        if (seleccion != -1) {
            System.out.println("Seleccionada opcion"+(seleccion+1));
        }
    }
}
