package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.getPositiveNumberFromUser;

public class Problema11 {
    public void exercitiul11(){
        System.out.println("Se se calculeze suma primelor n numere naturale, unde n este declarat ca si int n = 20");

        int n = (int)getPositiveNumberFromUser();
        int suma = 0;
        for (int i = 0; i<=n; i++){
            suma = suma + i;
        }

        System.out.println("SUma este " +  suma);
    }
}
