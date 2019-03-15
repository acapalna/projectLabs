package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema5 {

    public void exercitiul5(){
        System.out.println("5.Sa se genereze o tabla a inmulturii intre N si M, unde N si M sunt citite de la tastatura.");
        System.out.println("Acest program v-a lista tablele inmultirii dintre 2 numere citite de la tastaura");

        double n = getNumberFromUser();
        double m = getNumberFromUser();

        if (m < n){
            double k = n;
            n = m;
            m = k;
        }

        for(double i = n; i<= m; i++){
            System.out.println("Se genereaza tabla inmultirii cu " + i);
            generateMultiplicationTable(i);
        }
    }

    public void exercitiul5Varianta2(){
        System.out.println("5.Sa se genereze o tabla a inmulturii intre N si M, unde N si M sunt citite de la tastatura.");
        System.out.println("Acest program v-a lista tablele inmultirii dintre 2 numere citite de la tastaura");

        double n = getNumberFromUser();
        double m = getNumberFromUser();

        if (m < n){
            double k = n;
            n = m;
            m = k;
        }

        for(int i = (int) n; i<= (int) m; i++){
            System.out.println("Se genereaza tabla inmultirii cu " + i + ", folosind doar numerele intregi.");
            generateMultiplicationTable(i);
        }

    }
}
