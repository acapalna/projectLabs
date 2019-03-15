package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema1 {

    public void exercitiul1(){
        System.out.println("1.Sa se calculeze medie aritmetica a doua numere pozitive citite de la tastatura.");
        System.out.println("Acest program v-a calcula media artimetica a 2 numere.");

        double nr1 = getPositiveNumberFromUser();
        double nr2 = getPositiveNumberFromUser();

        double media = (nr1 + nr2) / 2;
        System.out.println("Media aritmetica a numerelor " + nr1 + " si " + nr2 + " este " + media);
    }
}
