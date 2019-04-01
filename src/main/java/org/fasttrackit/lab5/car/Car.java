package org.fasttrackit.lab5.car;

public class Car {

    public static int nrOfCars;

    private String name;
    private String model;
    private int power;
    private Roata roataSpateStanga = new Roata();
    private Roata roataSpateDreapta = new Roata();
    private Roata roataFataStanga;
    private Roata roataFataDreapta;
    private int nrOfWeels;
    private int nrOfChairs;


    public Car(){
        System.out.println("Constructor is called.");
        nrOfCars++;
        roataFataDreapta = new Roata();
        roataFataStanga = new Roata();
    }

    public Car(String name, String model){
//        this.name = name;
//        this.model = model;

        this();
        this.setName(name);
        this.setModel(model);

        System.out.println("Car " + this.getName() + " " + this.getModel() + " was created.");
    }

    public void transportPeople(){
        System.out.println("I am a car. I can transport people.");
    }

    public void run(){
        System.out.println("The car " + name + " " + model + " is running.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


}
