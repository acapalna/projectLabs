package org.fasttrackit.lab3;


public class Problema2 {

    public void ecercitiul2(){
        System.out.println("Acest program v-a calcula media artimetica a n numere pozitive citite de la tastatura.");

        int n = 2;
        double suma = 0;
        System.out.println("Introduceti un numar pozitiv mai mare sau egal cu 2 pentru a se calucula media.");
        do{
            double d = Helpers.getPositiveNumberFromUser();
            n = (int) d;
            if (n < 2) {
                System.out.println("Numarul introdus nu este mai mare sau egal cu 2.");
            }
        }while(n < 2);

        for(int i=0; i<n; i++){
            double number = 0;
            number = Helpers.getPositiveNumberFromUser();
            suma = suma + number;
        }

        double media = suma / n;
        System.out.println("Media numerelor este: " + media);
    }

    public void exercitiul2Varianta2() {
        System.out.println("Acest program v-a calcula media artimetica a n numere pozitive citite de la tastatura.");

        int n = 2;
        double suma = 0;

        System.out.println("Introduceti un numar pozitiv mai mare decat 2 pentru a se calucula media.");
        do {
            double d = Helpers.getPositiveNumberFromUser();
            n = (int) d;
            if (n < 2) {
                System.out.println("Acesta nu este un numar pozitiv mai mare sau egal cu 2.");
            }
        } while (n < 2);

        double[] numere = new double[n];

        for (int i = 0; i < n; i++) {
            numere[i] = Helpers.getPositiveNumberFromUser();
        }

        for (double nr : numere){
            suma = suma + nr;
        }

        double media = suma / n;

        System.out.print("Media numerelor ");
        Helpers.printNumbers(numere);
        System.out.print("este: " + media);
    }



}
