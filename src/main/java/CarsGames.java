import java.util.Scanner;

public class CarsGames {



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String car1;
        //car1 = "Ford";
        //car1 = scanner.nextLine();//
        String car2;
        //car2 = "Skoda";
        //car2 = scanner.nextLine();//
        String car3;
        //car3 = "Mercedes";
        //car3 = scanner.nextLine();//

        System.out.println("Scrie numele primei masini:");
        car1 = scanner.nextLine();
        System.out.println("Prima masina este: " + car1);

        System.out.println("Scrie numele masini nr 2:");
        car2 = scanner.nextLine();
        System.out.println("A 2-a masina este; " + car2);

        System.out.println("Scrie numele masini nr 3:");
        car3 = scanner.nextLine();
        System.out.println("A 3-a masina este: " + car3);


        String[] myCars = new String[3];
        myCars[0] = car1;
        myCars[1] = car2;
        myCars[2] = car3;


        for(int i=0; i<3; i++){
            int nr = i + 1;
            System.out.println("Masina "+ nr + " este: " + myCars[i]);
        }

        for(String masina : myCars){
            int nr = masina.indexOf(masina) + 1;
            System.out.println("Masina cu foreach este: " + nr + masina);
        }


        int i = 0;
        while(
                (i < myCars.length) &&
                        (myCars[i].charAt(0) != 'b') &&
                        (myCars[i].charAt(0) != 'B')

        ){
            System.out.println("Cu while masina este: " + myCars[i]);
            i++;
        }

        int indexDo = 0;
        do{
            System.out.println("Masina cu do while este: " + myCars[indexDo]);
            indexDo++;
        }while (indexDo < myCars.length);
    }
}
