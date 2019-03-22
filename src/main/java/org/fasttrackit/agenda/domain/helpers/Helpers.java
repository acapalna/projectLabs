package org.fasttrackit.agenda.domain.helpers;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.domain.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helpers {
    private static Scanner scanner = new Scanner(System.in);


    public static Contact createNewContactFromUser(){
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
        System.out.println("Agenda name: " + agenda.getAgendaName());
        System.out.println("Agenda owner: " + agenda.getOwner());
        for (Contact c : agenda.getContactList()){
            System.out.println(c.toString());
        }
    }

    public static List<Contact> createMultipleContacts(){
        List<Contact> contactList = new ArrayList<>();
        boolean a = true;

        System.out.println("Insert contact details.");
        while (a){
            contactList.add(createNewContactFromUser());
            System.out.println("Type \"yes\" to add a new contact.");
            if (!scanner.nextLine().equalsIgnoreCase("yes")){
                a = false;
                System.out.println("Stop creating contacts");
            }
        }

        return contactList;
    }

}
