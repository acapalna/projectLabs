package org.fasttrackit.lab3;

import java.util.Scanner;

public class Helpers {

    public static double getNumberFromUser(){
        Scanner sc = new Scanner(System.in);

        double nr = 0;
        int counter = 0;
        while(true){
            counter++;
            try{
                System.out.println("Introduceti un numar: ");
                nr = Double.valueOf(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                if(counter > 2){
                    System.out.println("Acesta nu este un numar. CHiar nu sti ce inseamna un numar? Mai da odata!");
                }else {
                    System.out.println("Acesta nu este un numar. Incercati din nou.");
                }
            }
        }
        return nr;
    }

    public static double getPositiveNumberFromUser(){
        double nr = 0;
        int counter = 0;
        do{
            counter++;
            nr = Helpers.getNumberFromUser();
            if (nr < 0) {
                if(counter > 2){
                    System.out.println("Este chiar asa de greu sa introduci un numar pozitiv? Mai da odata!");
                }else {
                    System.out.println("Acesta nu este un numar pozitiv. Incercati din nou.");
                }
            }
        }while(nr < 0);
        return nr;
    }

    public static void printNumbers(double[] numbers){
        for (double nr : numbers){
            System.out.print(nr + ", ");
        }
    }
}
