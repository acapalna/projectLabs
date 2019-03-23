package org.fasttrackit.lab3.Probleme;

import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema20 {
    public void exercitiul20(){
        System.out.println("20. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.");

        List<Integer> list = getListOfIntegerNumbers();
        System.out.println("Sirul introdus este: ");
        printIntNumbers(list);
        int a = (int)getNumberFromUser();
        int b = (int)getNumberFromUser();
        List<Integer> newList = new ArrayList<>();

        for(int nb : list){
            if((nb>=a) && (nb<=b)){
                newList.add(nb);
            }
        }

        printIntNumbers(newList);
    }
}
