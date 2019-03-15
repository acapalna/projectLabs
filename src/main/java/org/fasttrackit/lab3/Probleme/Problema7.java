package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema7 {
    public void exercitiul7(){
        System.out.println("7. Se da un numar a. Se se afiseze numarul invers");

        int number = (int) getNumberFromUser();
        int reverseNumber = 0;

        while(number != 0) {
            int nr = number % 10;
            reverseNumber = reverseNumber * 10 + nr;
            number /= 10;
        }

        System.out.println("Numarul scris invers este " + reverseNumber);
    }
}
