package org.fasttrackit.lab3;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema4 {
    public void exercitiul4(){
        System.out.println("4.Sa se genereze o tabla a inmultirii cu N, unde N este citit de la tastatura, de ex tabla inmultirii cu 5");
        System.out.println("Acest program v-a lista tabla inmultirii cu un numar citit de la tastatura");

        System.out.println("Introduceti un numar pentru a se genera tabla inmultirii cu acel numar");
        double nr = getNumberFromUser();
        System.out.println("Generam tabla inmultirii cu " + nr);
        for(int i = 0; i<=10; i++){
            double line = i * nr;
            String print = i + " X " + nr + " = " + line;
            System.out.println(print);
        }

    }
}
