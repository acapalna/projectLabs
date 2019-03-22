package org.fasttrackit.lab3.Probleme;

import java.util.Collections;
import java.util.List;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema18 {
    public void exercitiul18(){
        System.out.println("18. Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare\n" +
                "de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}");

        System.out.println("Introduceti sirul.");
        List<Integer> list = getListOfIntegerNumbers();
        System.out.println("Ati introodus sirul.");
        printIntNumbers(list);
        Collections.sort(list);
        printIntNumbers(list);

    }
}
