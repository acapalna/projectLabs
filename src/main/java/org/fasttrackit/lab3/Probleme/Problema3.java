package org.fasttrackit.lab3.Probleme;

import java.util.List;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema3 {
    public void exercitiul3() {
        System.out.println("3. Sa se determine maximul a N numere citite de la tastatura.");
        System.out.println("Acest program v-a determina cel mai mare numar introdus de la tastatura.");
        System.out.println("Daca ati introdus suficiente numere, introduceti OK");

        List<Double> numere = getListOfDoubleNumbers();

        double biggestNumber = determineTheBiggestNumber(numere);

        System.out.print("Ati introdus numerele: ");
        printNumbers(numere);
        System.out.println("\nCel mai mare numar introdus este: " + biggestNumber);
    }
}
