package org.fasttrackit.lab5.magazin;

import java.util.List;

public class Produs {
    private String name;
    private int pret;
    private int stoc;
    private int gramaj;
    private String descriere;

    private List<CategorieProdus> categorii;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public List<CategorieProdus> getCategorii() {
        return categorii;
    }

    public void setCategorii(List<CategorieProdus> categorii) {
        this.categorii = categorii;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Produs){
            if (this.getName() == null){
                return false;
            }else {

                return this.getName().equals(((Produs) obj).getName());
            }
        }else {
            return false;
        }

    }


}
