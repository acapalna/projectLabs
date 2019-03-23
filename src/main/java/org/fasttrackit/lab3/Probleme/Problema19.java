package org.fasttrackit.lab3.Probleme;

import java.util.List;

import static org.fasttrackit.lab3.Helpers.getListOfIntegerNumbers;
import static org.fasttrackit.lab3.Helpers.printIntNumbers;


public class Problema19 {
    public void exercitiul19(){
        System.out.println("19. Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate, " +
                "iar pentru a doua jumatate sa se afseze numerele triplate daca sunt impare si " +
                "numerele asa cum sunt in sir daca sunt pare.");

        List<Integer> list = getListOfIntegerNumbers();
        System.out.println("Sirul introdus este: ");
        printIntNumbers(list);

        for (int i=0; i<list.size()/2; i++){
            System.out.println("Position " + i + " number is " + list.get(i) + " double ->" + (list.get(i) * 2));
        }
        for (int i=list.size()/2; i<list.size(); i++){
            if(list.get(i) % 2 != 0){
                System.out.println("Position " + i + " number is odd " + list.get(i) + " triple ->" + list.get(i) * 3);
            }else{
                System.out.println("Position " + i + " number is even " + list.get(i) + " nothing ->" + list.get(i));
            }
        }


    }
}
