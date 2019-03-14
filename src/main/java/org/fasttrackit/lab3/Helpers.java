package org.fasttrackit.lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helpers {
    private static Scanner sc = new Scanner(System.in);

    public static double getNumberFromUser(){

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

    public static void printNumbers(List<Double> numbers){
        for (Double nr : numbers){
            System.out.print(nr + ", ");
        }
    }

    public static List getListOfNumbers(){
        List<Double> myList = new ArrayList<>();
        try {
            while (true) {
                System.out.println("Introduceti un numar intreg: ");
                myList.add(Double.valueOf(sc.nextLine()));
            }
        }catch(NumberFormatException e) {
            System.out.println("Ati introdus ceva ce nu este un numar. Programul v-a determina cel mai mare numar introdus.");
        }

        return myList;
    }

    public static double determineTheBiggestNumber(double[] arrayIntList){
        double biggestNumber = arrayIntList[0];

        for(double nr : arrayIntList){
            if (nr > biggestNumber){
                biggestNumber = nr;
            }
        }
        return biggestNumber;
    }

    public static double determineTheBiggestNumber(List<Double> list){
        double biggestNumber = list.get(0);

        for(Double nr : list){
            if (nr > biggestNumber){
                biggestNumber = nr;
            }
        }
        return biggestNumber;
    }

}
