package org.fasttrackit.lab5.magazin;

public class MagazinApplication {
    public static void main(String[] args) {

        CatalogDeProduse catalogDeProduse = new CatalogDeProduse();
        Produs productOne = new Produs();
        productOne.setName("Lapte");

        Produs productTwo = new Produs();
        productTwo.setName("Paine");

        catalogDeProduse.addProduct(productOne);
        catalogDeProduse.addProduct(productTwo);

        System.out.println("Magazinul are " + catalogDeProduse.getNumberOfProducts() + " produse.");


    }
}
