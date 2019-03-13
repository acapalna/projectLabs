package org.fasttrackit.lab3;


public class Problema2 {

    public void ecercitiul2(){
        System.out.println("Acest program v-a calcula media artimetica a n numere pozitive citite de la tastatura.");

        int n = 2;
        double suma = 0;
        System.out.println("Introduceti un numar pozitiv mai mare decat 2 pentru a se calucula media.");
        do{
            double d = Helpers.getNumberFromUser();
            n = (int) d;
            if (n < 2) {
                System.out.println("Acesta nu este un numar pozitiv mai mare decat 2.");
            }
        }while(n < 2);

        for(int i=0; i<n; i++){
            double number = 0;
            do{
                number = Helpers.getNumberFromUser();
                if (number < 0) {
                    System.out.println("Acesta nu este un numar pozitiv.");
                }
            }while(number < 0);

            suma = suma + number;
        }

        double media = suma / n;
        System.out.println("Media numerelor este: " + media);
    }

    public void ecercitiul2Varianta2() {
        System.out.println("Acest program v-a calcula media artimetica a n numere pozitive citite de la tastatura.");

        int n = 2;
        double suma = 0;


//        myCars[0] = car1;
//        myCars[1] = car2;
//        myCars[2] = car3;


        System.out.println("Introduceti un numar pozitiv mai mare decat 2 pentru a se calucula media.");
        do {
            double d = Helpers.getNumberFromUser();
            n = (int) d;
            if (n < 2) {
                System.out.println("Acesta nu este un numar pozitiv mai mare decat 2.");
            }
        } while (n < 2);

        double[] numere = new double[n];

        for (int i = 0; i < n; i++) {
            {
                do {
                    numere[i] = Helpers.getNumberFromUser();
                    if (numere[i] < 0) {
                        System.out.println("Acesta nu este un numar pozitiv.");
                    }
                } while (numere[i] < 0);
            }

        }

        for (double nr : numere){
            suma = suma + nr;
        }

        double media = suma / n;


        System.out.print("Media numerelor ");
        printNumbers(numere);
        System.out.print("este: " + media);
    }

    private void printNumbers(double[] numbers){
        for (double nr : numbers){
            System.out.print(nr + " ");
        }
    }

}
