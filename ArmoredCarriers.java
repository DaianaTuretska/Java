package com.company;

public class ArmoredCarriers extends Equipment {

    private String category;
    private String combat_module;
    private int power_reserve;

    public ArmoredCarriers(String name, String category, String combat_module, int countEquipment, int power_reserve) {

        super(name, countEquipment);
        this.category = category;
        this.power_reserve = power_reserve;
        this.combat_module = combat_module;
    }

    public void display() {

    }

    public String getCategory() {
        return category;
    }

    public String getCombat_module() {
        return combat_module;
    }

    public int getPower_reserve() {
        return power_reserve;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCombat_module(String category) {
        this.combat_module = combat_module;
    }

    public void setPower_reserve(int power_reserve) {
        this.power_reserve = power_reserve;
    }

    public String toString() {
        return getName() + "" + category + " " + combat_module + power_reserve + "km";
    }

    public static void main(String args[]) {
        ArmoredCarriers s1 = new ArmoredCarriers("БТР-4K", "Armored reconnaissance vehicle", "BM-7 <<Sail>>", 100, 690);
        ArmoredCarriers s2 = new ArmoredCarriers("БММ-4С", "armored medical machine", "BTR-4MV", 30, 500);


        System.out.println(s1);
        System.out.println(s2);
    }
}

