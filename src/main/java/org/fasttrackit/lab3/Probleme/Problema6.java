package org.fasttrackit.lab3.Probleme;

import static org.fasttrackit.lab3.Helpers.calculateSumOfDigits;
import static org.fasttrackit.lab3.Helpers.getNumberFromUser;

public class Problema6 {

    public void exercitiul6(){
        System.out.println("6.  Se da un numar natural a, de exemplu int a = 64321.");
        System.out.println("Cel mai mare numar posibil este: 2147483647. Daca introduceti un nr mai mare nu v-a fi luat in considerare");
        System.out.println("Acest program v-a manipula un numar lung citit de la tastatura");

        int a = (int) getNumberFromUser();
        System.out.println("Ati introdus numarul " + a);

        cerintaA(a);
        cerintaB(a);
        cerintaC(a);
        cerintaD(a);
    }

    private void cerintaA(int number){
        System.out.println("a) Sa se calculeze suma cifrelor numarului cat si produsul lor");

        int sum = 0;
        int add = 1;

        while (number != 0){
            sum = sum + number % 10;
            add = add * (number % 10);
            number = number/10;
        }

        System.out.println("Suma cifrelor este " + sum);
        System.out.println("Produsul cifrelor este " + add);
    }

    private void cerintaB(int number){
        System.out.println("b) sa se precizeze cate cifre are numarul citit");

        int counter = 0;
        while (number != 0){
            number = number/10;
            counter++;
        }
        System.out.println("Numarul introdus are " + counter + " cifre");
    }

    private void cerintaC(int number){
        System.out.println("c) sa se precizeze cifra maxima si minima a numarului a");

        int biggestNumber = 0;
        int smallestNumber = Integer.MAX_VALUE;

        while (number != 0){
            int a = number % 10;
            if(a > biggestNumber){
                biggestNumber = a;
            }
            if(a < smallestNumber){
                smallestNumber = a;
            }
            number = number/10;
        }
        System.out.println("Cea mai mare cifra a numarului este " + biggestNumber);
        System.out.println("Cea mai mica cifra a numarului este " + smallestNumber);
    }

    private void cerintaD(int number){
        System.out.println("d) sa se precizeze cifra de control a numarului a");

        int sum = calculateSumOfDigits(number);

        while(sum > 9){
            sum = calculateSumOfDigits(sum);
        }

        System.out.println("Cifra de control a numarului " + number + " este " + sum);

    }


}
