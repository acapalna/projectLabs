package org.fasttrackit.lab5.car;

public class Autobus extends Car{

    private int compostorBilete;

    public void composteazaBilet(){
        System.out.println("Compostez biet.");
    }

    public int getCompostorBilete() {
        return compostorBilete;
    }

    public void setCompostorBilete(int compostorBilete) {
        this.compostorBilete = compostorBilete;
    }
}
