package org.fasttrackit.catel;

public class TamagociGame {
    public static void main(String[] args){

//        Catel dog1 = new Catel();
//        dog1.setName("Rudolf");
//        dog1.setGreutate(4);
//        dog1.setVarsta(2);
//
//        dog1.manaca();
//        dog1.latra();

        Catel dog2 = new Catel();
        dog2.setName("Burcus");
        //dog2.setGreutate(17);

        for(int i=0; i<22; i++){
            String ani;

            dog2.manaca();
            dog2.latra();

            if (dog2.getVarsta() == 1)
                ani = " an";
            else
                ani = " ani";

            if(dog2.getVarsta() < dog2.getVarstaMaxima()) {
                System.out.println(dog2.getName() + " a mancat o data.");
                System.out.println(dog2.getName() + " are greutatea: " + dog2.getGreutate());
                System.out.println(dog2.getName() + " are " + dog2.getVarsta() + ani);
            }

        }

    }
}
