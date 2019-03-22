package org.fasttrackit.agenda.domain;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
    private String agendaName;
    private String owner;
    private List<Contact> contactList = new ArrayList<>();

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
