/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.indiomadosistema;

import java.util.Locale;

/**
 *
 * @author Alexandre Oliveira
 */
public class IndiomaDoSistema {

    public static void main(String[] args) {
      Locale locale = Locale.getDefault();
        System.out.println("Indioma " + locale.getDisplayLanguage());
        System.out.println("Código do indioma " + locale.getLanguage());
        System.out.println("País " + locale.getDisplayCountry());
        System.out.println("Código do país " + locale.getCountry());
    }
}
