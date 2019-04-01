package org.fasttrackit.lab6.figurigeometrice;

public class Triunghi extends FiguraGeometrica {

    private int lungLat1;
    private int lungLat2;
    private int lungLat3;

    public Triunghi(int lungLat1, int lungLat2, int lungLat3) {
        this.setName("Triunghi");
        this.lungLat1 = lungLat1;
        this.lungLat2 = lungLat2;
        this.lungLat3 = lungLat3;
    }

    @Override
    public int arie() {
        return 10;
    }

    @Override
    public int perimetru() {
        return lungLat1 + lungLat2 + lungLat3;
    }

    public int getLungLat1() {
        return lungLat1;
    }

    public void setLungLat1(int lungLat1) {
        this.lungLat1 = lungLat1;
    }

    public int getLungLat2() {
        return lungLat2;
    }

    public void setLungLat2(int lungLat2) {
        this.lungLat2 = lungLat2;
    }

    public int getLungLat3() {
        return lungLat3;
    }

    public void setLungLat3(int lungLat3) {
        this.lungLat3 = lungLat3;
    }
}
