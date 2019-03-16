package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema8 {
    public void exercitiul8(){
        System.out.println("8. Se da un numar a. Sa se determine daca numarul este palindrom ori nu. De ex 12344321 este palindrom");

        int givenNumber = (int) getNumberFromUser();
        int reverseNumber = reverseOfANumber(givenNumber);

        if(givenNumber == reverseNumber){
            System.out.println("Numarul introdus (" + givenNumber + ") este paliondrom");
        } else {
            System.out.println("Numarul introdus (" + givenNumber + ") nu este este paliondrom.");
            System.out.println("Daca este scris invers numarul este " + reverseNumber + ".");
        }
    }
}
