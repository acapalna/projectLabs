package org.fasttrackit.lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema1 {
    private Scanner sc = new Scanner(System.in);
    private double getNumber(){
        double nr = 0;
        while(true){
            try{
                System.out.println("Introduceti un numar: ");
                nr = Double.valueOf(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("Acesta nu este un numar. Incercati din nou.");
            }
        }
        return nr;
    }

    public void exercitiul1(){
        System.out.println("Acest program v-a calcula media artimetica a 2 numere.");
        String numarGresit = "Nu ati introdus un numar pozitiv.";
        double nr1 = 0;
        double nr2 = 0;

        do{
            nr1 = getNumber();
            if (nr1 < 0) {
                System.out.println(numarGresit);
            }
        }while(nr1 < 0);

        do{
            nr2 = getNumber();
            if (nr2 < 0) {
                System.out.println(numarGresit);
            }
        }while(nr2 < 0);

        double media = (nr1 + nr2) / 2;
        System.out.println("Media aritmetica a numerelor " + nr1 + " si " + nr2 + " este " + media);
    }
}
