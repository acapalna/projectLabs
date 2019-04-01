package org.fasttrackit.lab5.car;

import static org.fasttrackit.lab5.car.Car.nrOfCars;

public class CarApplication {
    public static void main(String[] args) {
        Car carMercedes = new Car();
        Car carFord = new Car();
        Car carAudi = new Car();


        carMercedes.setName("Mercedes");
        carMercedes.setModel("G class");
        carMercedes.run();

        carFord.setName("Ford");
        carFord.setModel("F150");
        carFord.run();

        carAudi.setName("Audi");
        carAudi.setModel("Q7");
        carAudi.run();

        Car trabant = new Car("Trabant", "601");

        Autobus myBuss = new Autobus();
        myBuss.setName("Scania");
        myBuss.setModel("xc700");
        myBuss.composteazaBilet();

        Camion myTruck = new Camion();
        myTruck.setName("Man");
        myTruck.setModel("bla bla");
        myTruck.transportMArfa();

        System.out.println("We have created " + nrOfCars + " cars");


        System.out.println();


    }
}
