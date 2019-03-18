package org.fasttrackit.agenda.domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {



    private String nameAgenda;
    private String owner;
    private List<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contact firstContact = new Contact();
        firstContact.setLastName("Pop");
        firstContact.setFirstName("Costel");

        Contact secondContact = new Contact();
        secondContact.setLastName("Pop");
        secondContact.setFirstName("Ana");

//        System.out.println(firstContact.toString());
//        System.out.println(secondContact.toString());
//
//        System.out.println("Check equals with == " + (secondContact==firstContact));
//        System.out.println("Check equals with equals " + secondContact.equals(firstContact));


        agenda.getContactList().add(firstContact);
        agenda.getContactList().add(secondContact);



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
}
