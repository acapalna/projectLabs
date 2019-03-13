package org.fasttrackit.lab3;

import java.util.Scanner;

public class Problema1 {

    public void exercitiul1(){
        System.out.println("Acest program v-a calcula media artimetica a 2 numere.");
        String numarGresit = "Nu ati introdus un numar pozitiv.";
        double nr1 = 0;
        double nr2 = 0;

        do{
            nr1 = Helpers.getNumberFromUser();
            if (nr1 < 0) {
                System.out.println(numarGresit);
            }
        }while(nr1 < 0);

        do{
            nr2 = Helpers.getNumberFromUser();
            if (nr2 < 0) {
                System.out.println(numarGresit);
            }
        }while(nr2 < 0);

        double media = (nr1 + nr2) / 2;
        System.out.println("Media aritmetica a numerelor " + nr1 + " si " + nr2 + " este " + media);
    }
}
