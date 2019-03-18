package org.fasttrackit.lab4.lab;

import java.util.Scanner;

public class MedieAritmetica {
    //private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //float media = calculMediaAritmetica();

        System.out.println("Media artitmetica  este: " + calculMediaAritmetica());

    }




    private static float calculMediaAritmetica(){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for(int i = 0; i<3; i++){
            System.out.println("Introduceti un numar.");
            suma += scanner.nextInt();      //suma = suma + scanner.nextInt();
        }

        return (float)suma/3;
    }


}
