package org.fasttrackit.lab6.figurigeometrice;

import java.sql.SQLOutput;

public class Cerc extends FiguraGeometrica {

    private int raza;

    public Cerc(int raza) {
        this.setName("Cerc");
        this.raza = raza;
    }

    public Cerc() {
        this.setName("Cerc");
    }

    @Override
    public int arie() {
        long rounded = Math.round(raza*raza*Math.PI);

        System.out.println("Rounded " + rounded);
        System.out.println("Cast " + (int) (raza*raza*Math.PI));

        return (int) (raza*raza*Math.PI);
    }

    @Override
    public int perimetru() {
        return (int) (2*Math.PI*raza);
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
