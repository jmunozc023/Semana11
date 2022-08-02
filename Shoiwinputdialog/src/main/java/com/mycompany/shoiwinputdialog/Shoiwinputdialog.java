package com.mycompany.shoiwinputdialog;
import javax.swing.*;
public class Shoiwinputdialog {
    
    public static void main(String[] args) {
        String seleccion = JOptionPane.showInputDialog(null, "Digite su nombre" , "");
        System.out.println("El usuario ha escrito "+seleccion);
    }
}
