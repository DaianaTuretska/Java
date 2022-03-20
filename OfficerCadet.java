package com.company;

class OfficerCadet extends Rank {
    private String subdivision;
    private String typeArmy;
    private String badge;
    private String category;

    public OfficerCadet(String typeArmy, String name, String category, String badge, String subdivision) {

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

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public void setTypeArmy(String typeArmy) {
        this.typeArmy = typeArmy;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return getName() + "" + typeArmy + subdivision + " " + badge + category;
    }

    public static void main(String args[]) {
        OfficerCadet s1 = new OfficerCadet("Land Military", "OfficerCadet", "ordinary", "K", "squadron");
        OfficerCadet s2 = new OfficerCadet("Marine Corps", "OfficerCadet", "ordinary", "K", "squadron");


        System.out.println(s1);
        System.out.println(s2);
    }

    public void display() {

    }
}
