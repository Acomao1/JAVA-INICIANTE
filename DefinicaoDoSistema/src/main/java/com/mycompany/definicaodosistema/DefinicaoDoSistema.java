/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.definicaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Alexandre Oliveira
 */
public class DefinicaoDoSistema {

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = (int) screenSize.getWidth();
        int altura = (int) screenSize.getHeight();
        
        System.out.println("Resolução da Tela: " + largura + " x " + altura);
        }
}
