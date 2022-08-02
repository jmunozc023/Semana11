package com.mycompany.showconfirmdialog;
import javax.swing.*;
public class Showconfirmdialog {
    
    public static void main(String[] args) {
        int confirmado= JOptionPane.showConfirmDialog(null, "Lo confirmas?");
        if (JOptionPane.OK_OPTION== confirmado) {
            System.out.println("Confirmado borrar");
        } else {
            System.out.println("No borrar...");
        }
    }
}
