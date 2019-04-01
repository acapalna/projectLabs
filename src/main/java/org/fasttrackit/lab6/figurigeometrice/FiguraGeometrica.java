package org.fasttrackit.lab6.figurigeometrice;

public abstract class FiguraGeometrica {

    private String name;

    public int perimetru(){
        return 0;
    }

    public abstract int arie();

    public void deseneaza(){
        System.out.println("Am desenat " + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
