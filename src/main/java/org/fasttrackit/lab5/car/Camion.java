package org.fasttrackit.lab5.car;

public class Camion extends Car{
    private String bena;
    private int tonaj;

    public void transportMArfa(){
        System.out.println("Sunt camion. Transport marfa.");
    }

    public Camion(){
//        super();
        bena = "bena";
    }

    public Camion(String name, String model){
        super(name, model);
    }
}
