package com.company;

class AirForce extends Army {
    private int battalions;
    private String equipment;

    public AirForce(String name, int battalions, int countPerson, String equipment) {

        super(name, countPerson);
        this.battalions = battalions;
        this.equipment = equipment;
    }

    public AirForce(String name, int countPerson) {
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
        AirForce s1 = new AirForce("Air Force", 120, 4, "Aviation");


        System.out.println(s1);
    }

    public void display() {

    }
}

