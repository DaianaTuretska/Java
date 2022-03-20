package com.company;

class General extends Rank {
    private String subdivision;
    private String typeArmy;
    private String badge;
    private String category;

    public General(String typeArmy, String name, String category, String badge, String subdivision) {

        super(name);
        this.badge = badge;
        this.subdivision = subdivision;
        this.category = category;
        this.typeArmy = typeArmy;
    }

    public String getBadge() {
        return badge;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public String getCategory() {
        return category;
    }

    public String getTypeArmy() {
        return typeArmy;
    }

    public String toString() {
        return getName() + "" + typeArmy + subdivision + " " + badge + category;
    }

    public static void main(String args[]) {
        General s1 = new General("Land Military", "General", "senior officers", "4 stars with sign", "Post");
        General s2 = new General("Marine Corps", "General", "senior officers", "4 stars with sign", "Crew");


        System.out.println(s1);
        System.out.println(s2);
    }

    public void display() {

    }
}

