package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.getNumberFromUser;
import static org.fasttrackit.lab3.Helpers.nrLaPuterea;

public class Problema17 {
    public void exercitiul17(){
        System.out.println("17. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:\n" +
                "suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n .");

        System.out.println("Insert value for x: ");
        int x = (int) getNumberFromUser();
        System.out.println("Insert value for n: ");
        int n = (int) getNumberFromUser();

        float suma = (1+x+x)*(1+x+x);
        for (int i = 3; i<=n; i++){
            suma = suma + nrLaPuterea(x, i);
        }

        System.out.println("Suma este: " + suma);

    }

}
