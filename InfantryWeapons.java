package com.company;

public class InfantryWeapons extends Equipment {

    private String category;
    private int power;

    public InfantryWeapons(String name, String category, int countEquipment, int power) {

        super(name, countEquipment);
        this.category = category;
    }


    public String getCategory() {
        return category;
    }

    public int getPower() {
        return power;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return getName() + "" + category + " " + power + "mm";
    }

    public static void main(String args[]) {
        InfantryWeapons s1 = new InfantryWeapons("ВТ APR308", "sniper rifle", 50, 62);
        InfantryWeapons s2 = new InfantryWeapons("AK-47", "machine rifle", 150, 5);
        InfantryWeapons s3 = new InfantryWeapons("M60 Camerton", "machine rifle", 70, 60);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public void display() {

    }
}

