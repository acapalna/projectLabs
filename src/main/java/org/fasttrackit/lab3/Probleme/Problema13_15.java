package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.getNumberFromUser;
import static org.fasttrackit.lab3.Helpers.getPositiveNumberFromUser;

public class Problema13_15 {
    public void exercitiul13(){
        System.out.println("13. se da un numar . se se afiseze true daca numrul apartine intervalului [9,24] , altfel sa se afiseze true.");

        int a = (int)getNumberFromUser();
        boolean check = false;
        if(a>=9 && a<=24){
            check = true;
        }
        System.out.println(check);
    }

    public void exercitiul14(){
        System.out.println("14. se dau doua numere a si n. sa se afiseze numarul a la puterea n");

        int a = (int) getPositiveNumberFromUser();
        int n = (int) getPositiveNumberFromUser();
        int result = 1;
        for(int i=1; i<=n; i++){
            result = result*a;
        }

        System.out.println("Rezultatul este " + result);
    }

    public void exercitiul15(){
        System.out.println("15. Sa se calculeze factorialul unui numar a .");
        int a = (int) getPositiveNumberFromUser();

        long result = 1;
        for(int i=1; i<=a; i++){
            result = result*i;
        }
        System.out.println("Factoriaul numarului " + a + " este " + result);
    }
}
