package com.company;

public class Gun extends Equipment {

    private String category;
    private int caliber;

    public Gun(String name, String category, int countEquipment, int caliber) {

        super(name, countEquipment);
        this.category = category;
        this.caliber = caliber;
    }

    public void display() {

    }

    public String getCategory() {
        return category;
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public String toString() {
        return getName() + "" + category + " " + caliber;
    }

    public static void main(String args[]) {
        Gun s1 = new Gun("2А65 «Мста-Б»", "Main battle tank", 60, 152);
        Gun s2 = new Gun("Д-30", "МТ-12 Рапіра", 30, 122);

        System.out.println(s1);
        System.out.println(s2);
    }
}

