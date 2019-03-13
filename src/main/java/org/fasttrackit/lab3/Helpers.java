package org.fasttrackit.lab3;

import java.util.Scanner;

public class Helpers {

    public static double getNumberFromUser(){
        Scanner sc = new Scanner(System.in);

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
}
