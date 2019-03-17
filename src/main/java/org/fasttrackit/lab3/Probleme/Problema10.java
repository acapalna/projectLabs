package org.fasttrackit.lab3.Probleme;

import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema10 {
    public void exercitiul10(){
        System.out.println("Se da un sir de numere ordonate crescator.\n" +
                "Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.");
        System.out.println("Introduceti 1 pentru a introduce sirul manual sau 2 pentru a folosi sirul: 1,2,3,4,5,6,15,21,44,70,101");


        int askNumber = 0;
        List<Integer> lista = new ArrayList<>();

        while (askNumber < 1 || askNumber > 2){
            askNumber = (int) getPositiveNumberFromUser();
            if (askNumber == 1){
                System.out.println("Acum vom scrie sirul. Introduceti cate un numar urmat de tasta enter. " +
                        "Cand ati introdus suficiente numere, apasati o litera.");
                lista = getListOfIntegerNumbers();
                System.out.print("Ati introdus sirul: ");
                for (int i=0; i<lista.size();i++){
                    System.out.print(i + ", ");
                }
            }else{
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(4);
                lista.add(5);
                lista.add(6);
                lista.add(15);
                lista.add(21);
                lista.add(44);
                lista.add(70);
                lista.add(101);
            }
        }

        System.out.println("Acum avem nevoie de un numar pt comparat");
        int numarDeControl = (int) getNumberFromUser();
        boolean check = false;

        for(int i=0; i<lista.size();i++){
            if(i == numarDeControl){
                System.out.println("Numarul introdus se gaseste in sir la pozitia " + lista.indexOf(i));
                check = true;
                break;
            }
        }

        if(!check){
            System.out.println("-1");
            System.out.println("Numarul introdus nu este in sirul introdus");
        }
    }
}
