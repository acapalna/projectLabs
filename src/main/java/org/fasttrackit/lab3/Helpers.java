package org.fasttrackit.lab3;

import org.fasttrackit.lab3.Probleme.*;

import java.util.*;

public class Helpers {
    private static Scanner scanner = new Scanner(System.in);
    public static Problema1 problema1 = new Problema1();
    public static Problema2 problema2 = new Problema2();
    public static Problema3 problema3 = new Problema3();
    public static Problema4 problema4 = new Problema4();
    public static Problema5 problema5 = new Problema5();
    public static Problema6 problema6 = new Problema6();
    public static Problema7 problema7 = new Problema7();
    public static Problema8 problema8 = new Problema8();
    public static Problema9 problema9 = new Problema9();
    public static Problema10 problema10 = new Problema10();
    public static Problema11 problema11 = new Problema11();
    public static Problema12 problema12 = new Problema12();
    public static Problema13_15 problema13 = new Problema13_15();
    public static Problema16 problema16 = new Problema16();
    public static Problema17 problema17 = new Problema17();
    public static Problema18 problema18 = new Problema18();
    public static Problema19 problema19 = new Problema19();
    public static Problema20 problema20 = new Problema20();

    public static double getNumberFromUser(){

        double nr = 0;
        int counter = 0;
        while(true){
            counter++;
            try{
                System.out.println("Introduceti un numar: ");
                nr = Double.valueOf(scanner.nextLine());
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

    public static void printNumbers(int[] numbers){
        for (int nr : numbers){
            System.out.print(nr + ", ");
        }
    }

    public static void printNumbers(List<Double> numbers){
        for (Double nr : numbers){
            System.out.print(nr + ", ");
        }
    }

    public static void printIntNumbers(List<Integer> numbers){
        for (int nr : numbers){
            System.out.print(nr + ", ");
        }
        System.out.println("\nAti introdus " + numbers.size() + " numere.");
    }

    public static List<Double> getListOfDoubleNumbers(){
        List<Double> myList = new ArrayList<>();
        try {
            while (true) {
                System.out.println("Introduceti un numar intreg: ");
                myList.add(Double.valueOf(scanner.nextLine()));
            }
        }catch(NumberFormatException e) {
            System.out.println("Ati introdus ceva ce nu este un numar. Programul v-a prelucra numarul introdus.");
        }

        return myList;
    }

    public static List<Integer> getListOfIntegerNumbers(){
        List<Integer> myList = new ArrayList<>();
        try {
            while (true) {
                System.out.println("Introduceti un numar intreg: ");
                myList.add(Integer.valueOf(scanner.nextLine()));
            }
        }catch(NumberFormatException e) {
            System.out.println("Ati introdus ceva ce nu este un numar. Programul v-a prelucra numarul introdus.");
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

    public static void generateMultiplicationTable(double number){
        for(int i = 0; i<=10; i++){
            double line = i * number;
            String print = i + " X " + number + " = " + line;
            System.out.println(print);
        }
    }

    public static int calculateSumOfDigits(int number){
        int sum = 0;
        while (number != 0){
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;
    }

    public static int reverseOfANumber(int number){
        int reverseNumber = 0;
        while(number != 0) {
            int nr = number % 10;
            reverseNumber = reverseNumber * 10 + nr;
            number /= 10;
        }
        return reverseNumber;
    }

    public static List<Integer> integerToList(int number){
        List<Integer> myList = new ArrayList<>();
        while (number != 0){
            int nr = number % 10;
            myList.add(nr);
            number = number/10;
        }
        Collections.reverse(myList);

        return myList;
    }

    public static int calculateCheckSum(int number){
        int sum = calculateSumOfDigits(number);

        while(sum > 9){
            sum = calculateSumOfDigits(sum);
        }

        return sum;
    }

    public static float nrLaPuterea(int x, int n){
        float result = 1;
        for(int i=1; i<=n; i++){
            result = result*x;
        }
        return result;
    }
}
