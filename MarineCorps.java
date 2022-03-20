package com.company;

public class MarineCorps extends Army {
    private int battalions;
    private String equipment;

    public MarineCorps(String name, int countPerson, int battalions, String equipment) {

        super(name, countPerson);
        this.battalions = battalions;
        this.equipment = equipment;
    }

    public MarineCorps(String name, int countPerson) {
        super(name, countPerson);
    }

    public int getBattalions() {
        return battalions;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setBattalions(int battalions) {
        this.battalions = battalions;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String toString() {
        return getName() + "" + getCountPerson() + " " + battalions + equipment;
    }

    public static void main(String args[]) {
        MarineCorps s1 = new MarineCorps("Marine Corps", 120, 4, "warships");


        System.out.println(s1);
    }

    public void display() {

    }
}


