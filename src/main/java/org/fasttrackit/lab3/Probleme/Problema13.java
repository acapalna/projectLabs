package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.getNumberFromUser;

public class Problema13 {
    public void exercitiul13(){
        System.out.println("13. se da un numar . se se afiseze true daca numrul apartine intervalului [9,24] , altfel sa se afiseze true.");

        int a = (int)getNumberFromUser();
        boolean check = false;
        if(a>=9 && a<=24){
            check = true;
        }
        System.out.println(check);
    }
}
