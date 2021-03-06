package org.fasttrackit.agenda.domain;

import org.fasttrackit.agenda.domain.helpers.XmlManipulation;

import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.agenda.domain.helpers.Helpers.*;


public class Agenda {
    private String agendaName;
    private String owner;
    private List<Contact> contactList = new ArrayList<>();


    public static void main(String[] args) {
        Agenda agenda = new Agenda();

//        Contact firstContact = new Contact();
//        firstContact.setLastName("vraja");
//        firstContact.setFirstName("Ion");
//        firstContact.setPhone("333333333");
//        firstContact.setAddress("Asta-i primul");
//        agenda.getContactList().add(firstContact);
//
//        Contact secondContact = new Contact();
//        secondContact.setLastName("Pop");
//        secondContact.setFirstName("Ana");
//        secondContact.setPhone("012345678");
//        secondContact.setAddress("Atat s-a putut");
//        agenda.getContactList().add(secondContact);
//
//        agenda.setAgendaName("PrimaAgenda");
//        agenda.setOwner("Burcus");

        System.out.println("Insert agenda name:");
        agenda.setAgendaName(readFromKeyboard());
        System.out.println("Insert agenda owner");
        agenda.setOwner(readFromKeyboard());

//        System.out.println("Create first contact");
//        Contact firstContact = createNewContactFromUser();
//        agenda.getContactList().add(firstContact);
//
//        System.out.println("Create second contact");
//        Contact secondContact = createNewContactFromUser();
//        agenda.getContactList().add(secondContact);


        agenda.setContactList(createMultipleContacts());

        printAgenda(agenda);

        XmlManipulation.writeAgendaToXMLFile(agenda);
    }





    public String getAgendaName() {
        return agendaName;
    }

    public void setAgendaName(String agendaName) {
        this.agendaName = agendaName;
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
