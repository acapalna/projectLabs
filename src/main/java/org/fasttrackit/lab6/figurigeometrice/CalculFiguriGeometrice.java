package org.fasttrackit.lab6.figurigeometrice;

import java.util.*;

public class CalculFiguriGeometrice {

    public static void main(String[] args) {

    Patrat patrat1 = new Patrat(3);
    Cerc cerc1 = new Cerc(4);
    Triunghi triunghi1 = new Triunghi(2,3,4);

    patrat1.setName("patratul 1");
    patrat1.arie();
    patrat1.perimetru();
    patrat1.deseneaza();

    cerc1.setName("cercul 1");
    cerc1.arie();
    cerc1.perimetru();
    cerc1.deseneaza();

    triunghi1.setName("triunghiul 1");
    triunghi1.arie();
    triunghi1.perimetru();
    triunghi1.deseneaza();


    FiguraGeometrica patratFigurageometrica = new Patrat(6);

    System.out.println("-----------------------------");
    System.out.println("Arie Patrat1 " + patrat1.arie());
    System.out.println("Perimetru Patrat1 " + patrat1.perimetru());
    patrat1.deseneaza();

    FiguraGeometrica cercFigGeom = new Cerc();
    ((Cerc) cercFigGeom).setRaza(3);




    Set<FiguraGeometrica> figuriGeometriceSet = new HashSet();
    figuriGeometriceSet.add(cerc1);
    figuriGeometriceSet.add(patrat1);
    figuriGeometriceSet.add(triunghi1);
    figuriGeometriceSet.add(cercFigGeom);
    figuriGeometriceSet.add(patratFigurageometrica);

    System.out.println(".........DE ACI hashset...................................");

    for (FiguraGeometrica a : figuriGeometriceSet){
        System.out.println("............................................");
        a.deseneaza();
        System.out.println(a.arie());
    }

    List<FiguraGeometrica> arrayListFigGeom = new LinkedList<>();
    arrayListFigGeom.add(cerc1);
//    arrayListFigGeom.add(patrat1);
    arrayListFigGeom.add(triunghi1);
    arrayListFigGeom.add(cercFigGeom);
    arrayListFigGeom.add(patratFigurageometrica);

    arrayListFigGeom.add(0,patrat1);

    System.out.println(".........DE ACI list...................................");

    for (FiguraGeometrica a : arrayListFigGeom){
        System.out.println("............................................");
        a.deseneaza();
        System.out.println(a.arie());
    }

    }

}
