package com.company;

class Conscripts extends Person {

    private boolean suitable;
    private String address;
    private String phone;

    public Conscripts(String name, String lastname, String address, String phone, int age, boolean suitable) {

        super(name, lastname, age);
        this.address = address;
        this.suitable = suitable;
        this.phone = phone;

    }

    public void display() {
    }

    public String getAddress() {
        return address;
    }

    public boolean getSuitable() {
        return suitable;
    }

    public String getPhone() {
        return phone;
    }

    public void setSuitable(boolean suitable) {
        this.suitable = suitable;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return suitable+" "+address+" "+phone;
    }
    public static void main(String args[]){
        Conscripts s1=new Conscripts("Darius","Raj","Kobulyanska street", "+38099425262779",18, true);
        Conscripts s2=new Conscripts("Brandon","Debonair","Golovna street", "+380669232110",21, false);


        System.out.println(s1);
        System.out.println(s2);
    }
}


