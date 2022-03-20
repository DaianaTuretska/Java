package com.company;

public class Tanks extends Equipment {

    private String category;
    private int damage;

    public Tanks(String name, String category, int countEquipment, int damage) {

        super(name, countEquipment);
        this.category = category;
        this.damage = damage;
    }

    public String getCategory() {
        return category;
    }

    public int getDamage() {
        return damage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPower(int power) {
        this.damage = power;
    }

    public String toString() {
        return getName() + "" + category + " " + damage;
    }

    public static void main(String args[]) {
        Tanks s1 = new Tanks("Т-64БВ", "Main battle tank", 50, 110);
        Tanks s2 = new Tanks("Т-80", "hard", 70, 75);


        System.out.println(s1);
        System.out.println(s2);
    }
    public void display() {

    }
}
