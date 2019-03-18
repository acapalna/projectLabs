package org.fasttrackit.agenda.domain;

import java.util.Objects;

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setFirstName(String firstNameParam){
        if(firstNameParam.equalsIgnoreCase("")){
            throw new IllegalArgumentException("First name can not be empty.");
        }
        this.firstName = firstNameParam;
    }

    public String getFirstName(){
        return this.firstName;
    }







//    citire();
//    save();
//    set();
//    get();
//    display();

    public String toString(){
        return "First name is: " + firstName + "." +
                "\nLast name is: " + lastName;
    }

    @Override
    public boolean equals(Object o){
        Contact second = (Contact) o;
        if(((Contact) o).getFirstName().equals(this.firstName)
                && second.getLastName().equals(this.lastName)){
            return true;
        }else {
            return false;
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Contact)) return false;
//        Contact contact = (Contact) o;
//        return Objects.equals(firstName, contact.firstName) &&
//                Objects.equals(lastName, contact.lastName) &&
//                Objects.equals(phone, contact.phone) &&
//                Objects.equals(address, contact.address);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, phone, address);
//    }
}
