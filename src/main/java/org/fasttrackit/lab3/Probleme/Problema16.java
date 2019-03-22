package org.fasttrackit.lab3.Probleme;

import java.util.List;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema16 {
    public void exercitiul16(){
        System.out.println("16. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.\n" +
                " de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8");

        List<Integer> sirul = getListOfIntegerNumbers();
        printIntNumbers(sirul);
        int s = 0;
        System.out.println("Perechile de numere cerute sunt: ");
        for (int a : sirul){
            if (s > a){
                System.out.println(s + " - " + a);
            }
            s = a;
        }
    }
}
