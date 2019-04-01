package org.fasttrackit.lab5.magazin;

import java.util.ArrayList;
import java.util.List;

public class CatalogDeProduse {

    private List<Produs> produse = new ArrayList<Produs>();

    public void addProduct(Produs produsToAdd){
//        if(produse.contains(produsToAdd)){
//            produsToAdd.setStoc(2);
//        }
        for (Produs p : produse){
            if (p.getName().equals(produsToAdd.getName())){
                p.setStoc(p.getStoc() + 1);
                break;
            }else{
                produse.add(produsToAdd);
            }

        }


    }

    public int getNumberOfProducts(){
        return produse.size();
    }




}
