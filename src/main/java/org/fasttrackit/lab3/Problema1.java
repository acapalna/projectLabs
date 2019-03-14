package org.fasttrackit.lab3;

import java.util.Scanner;

public class Problema1 {

    public void exercitiul1(){
        System.out.println("Acest program v-a calcula media artimetica a 2 numere.");

        double nr1 = Helpers.getPositiveNumberFromUser();
        double nr2 = Helpers.getPositiveNumberFromUser();

        double media = (nr1 + nr2) / 2;
        System.out.println("Media aritmetica a numerelor " + nr1 + " si " + nr2 + " este " + media);
    }
}
