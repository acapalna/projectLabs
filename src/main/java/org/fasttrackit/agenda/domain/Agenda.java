package org.fasttrackit.agenda.domain;

import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.agenda.domain.Helpers.*;

public class Agenda {



    private String nameAgenda;
    private String owner;
    private List<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        System.out.println("Create first contact");
        Contact firstContact = createNewContactFromUser();
        System.out.println("Create second contact");
        Contact secondContact = createNewContactFromUser();


//        Contact secondContact = new Contact();
//        secondContact.setLastName("Pop");
//        secondContact.setFirstName("Ana");
//        secondContact.setPhone("012345678");
//        secondContact.setAddress("Atat s-a putut");

        System.out.println("Insert agenda name:");
        agenda.setNameAgenda(readFromKeyboard());
        System.out.println("Insert agenda owner");
        agenda.setOwner(readFromKeyboard());
        agenda.getContactList().add(firstContact);
        agenda.getContactList().add(secondContact);


        printAgenda(agenda);
        System.out.println("");

    }



    public String getNameAgenda() {
        return nameAgenda;
    }

    public void setNameAgenda(String nameAgenda) {
        this.nameAgenda = nameAgenda;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void saveAgendaToXML(Agenda agenda){

    }
}
