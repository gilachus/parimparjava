/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gilachus.paroimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args){
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa un numero"));
        //boolean esPar = numero%2 == 0;
        boolean esPar = numero/2 == Math.round(numero/2);
        if(esPar){
            JOptionPane.showMessageDialog(null, "El numero es Par");
        }else {
            JOptionPane.showMessageDialog(null, "El numero es Impar");
        }
    }
}
