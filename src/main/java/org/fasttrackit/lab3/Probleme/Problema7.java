package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema7 {
    public void exercitiul7(){
        System.out.println("7. Se da un numar a. Se se afiseze numarul invers");

        int givenNumber = (int) getNumberFromUser();
        int reverseNumber = reverseOfANumber(givenNumber);

        System.out.println("Numarul scris invers este " + reverseNumber);
    }

}
