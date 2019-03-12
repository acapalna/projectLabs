package org.fasttrackit.catel;

public class Catel {



    private String name;
    private int greutate;
    private int varsta;
    private final int varstaMaxima = 11;
    private final int[] greutateViata = {5, 8, 10, 12, 14, 15, 16, 17, 18, 19, 20};

    public void latra(){
        if (varsta < varstaMaxima) {
            System.out.println("Ham!");
        }else {
            System.out.println(name + " nu mai latra pentru ca a murit.");
        }
    }

    public void manaca(){
        greutate++;
        //System.out.println("Noua greutate este: " + greutate);

        for(int i: greutateViata){
            if(i == greutate){
                varsta++;
            }
            if (i == 17 && varsta == (varstaMaxima - 2)){
                System.out.println(name + " a imbatranit foarte mult si este grasut.");
            }
            if (i == 18 && varsta == (varstaMaxima - 1)){
                System.out.println(name + " este foarte batran si prea gras.");
            }
            if (i == 19 && varsta == (varstaMaxima)){
                System.out.println(name + " mai traieste un an ca e prea gras.");
            }
            if (i == 20 && varsta == (varstaMaxima + 1)){
                System.out.println(name + " A MURIT SI TU ESTI VINOVAT CA L-AI INFUNDAT CU MANCARE");
            }
            if (i == 20 && varsta > (varstaMaxima + 1)){
                System.out.println(name + " a murit. De ce tot ii infunzi mancarea in gura?????");
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNames(String wantedName){
        name = wantedName;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVarstaMaxima() {
        return varstaMaxima;
    }
}
