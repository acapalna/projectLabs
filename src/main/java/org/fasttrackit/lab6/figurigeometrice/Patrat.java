package org.fasttrackit.lab6.figurigeometrice;

public class Patrat extends FiguraGeometrica {

    private int lungimeLatura;

    public Patrat(int lungimeLatura) {
        this.setName("Patrat");
        this.lungimeLatura = lungimeLatura;
    }

    @Override
    public int arie() {
        return (lungimeLatura * lungimeLatura);
    }

    @Override
    public int perimetru() {
        return (lungimeLatura * 4);
    }

    public int getLungimeLatura() {
        return lungimeLatura;
    }

    public void setLungimeLatura(int lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
    }
}
