package org.fasttrackit.lab3.Probleme;

import java.sql.SQLOutput;
import java.util.List;

import static org.fasttrackit.lab3.Helpers.*;

public class Problema9 {
    public void exercitiul9(){
        System.out.println("9.Se da un numar a. Se se afiseze un numar b format doar din numerele impare ale numarului a, " +
                "si un numar c format din patratul numerelor pare ale numarului a.");

        StringBuilder numerePare = new StringBuilder();
        StringBuilder numereImpare = new StringBuilder();

        int givenNumber = (int) getPositiveNumberFromUser();
        int nrPare = 0, patratulNrPare;

        while(givenNumber!=0){
            int a = givenNumber % 10;
            if(a % 2 != 0){
                numereImpare.append(a);
                numereImpare.append(" ");
            }else{
                numerePare.append(a);
                numerePare.append(" ");
                nrPare = (nrPare * 10) + a;
            }

            givenNumber = givenNumber/10;
        }
        nrPare = reverseOfANumber(nrPare);


        patratulNrPare = nrPare * nrPare;
        numereImpare.reverse();
        numerePare.reverse();
        System.out.println("Numerele impare sunt: " + numereImpare);
        System.out.println("Numerele pare sunt: " + numerePare);
        System.out.println("Patratul numerelor pare este " + patratulNrPare);
    }

    public void exercitiul9Varianta2(){
        System.out.println("A 2-a varianta de afisat patratul numerelor pare");

        int givenNumber = (int) getPositiveNumberFromUser();
        List<Integer> lista = integerToList(givenNumber);
        StringBuilder nrParV1 = new StringBuilder();
        int nrParV2 = 0;
        int nrParV3 = 0;

        for(Integer a : lista){
            if(a % 2 == 0){
                nrParV1.append(a*a);
                nrParV2 = nrParV2 + (a*a);
                nrParV3 = nrParV3 + a;
            }
        }
        nrParV3 = nrParV3 * nrParV3;
        System.out.println("Varinata lipind patratele numerelor pare (2*2 4*4 = 416) este " + nrParV1);
        System.out.println("Varianta adunand patratele numerelor pare (2*2 + 4*4 = 20) este " + nrParV2);
        System.out.println("Varinata adunand numerele patrate si facut patratul lor (2+4=6  6*6) " + nrParV3);

    }
}
