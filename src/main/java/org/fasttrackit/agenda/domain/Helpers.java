package org.fasttrackit.agenda.domain;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Helpers {
    private static Scanner scanner = new Scanner(System.in);


    public static  Contact createNewContactFromUser(){
        Contact contact = new Contact();

        System.out.println("Insert first name:");
        contact.setFirstName(readFromKeyboard());
        System.out.println("Insert last name:");
        contact.setLastName(readFromKeyboard());
        System.out.println("Insert phone number:");
        contact.setPhone(readFromKeyboard());
        System.out.println("Insert address:");
        contact.setAddress(readFromKeyboard());

        return contact;
    }

    public static String readFromKeyboard(){
        String a = "";
        try {
            while(a.equals("")){
                a = scanner.nextLine();
            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
        return a;
    }

    public static void printAgenda(Agenda agenda){
        System.out.println("Agenda name: " + agenda.getNameAgenda());
        System.out.println("Agenda owner: " + agenda.getOwner());
        for (Contact c : agenda.getContactList()){
            System.out.println(c.toString());
        }
    }

}
