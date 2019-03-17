package org.fasttrackit.lab3.Probleme;

import java.util.List;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema12 {
    public void exercitiul12(){
        System.out.println("12.Se da un sir de numere naturale, ideal de peste doua cifre. " +
                "Sa se determine cea mai mare valoare din sir care are suma de control sub 4.\n" +
                "de ex\n" +
                "int[] sir ={12, 34,35, 11,34}");

        System.out.println("Acum vom scrie sirul. Introduceti cate un numar urmat de tasta enter. " +
                "Cand ati introdus suficiente numere, apasati o litera.");

        List<Integer> lista = getListOfIntegerNumbers();

        int nr = 0;

        for (int i=0; i<lista.size();i++){
            int valueOf_i = lista.get(i);
            int a = calculateCheckSum(valueOf_i);
            if(a<4){
                if(valueOf_i > nr){
                    nr = valueOf_i;
                }
            }
        }


        System.out.println("cea mai mare valoare din sir care are suma de control sub 4 este " + nr);

    }
}
