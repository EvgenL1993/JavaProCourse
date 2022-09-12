package org.homework4.weaponsAndArmy.entity.weapon;

public abstract class SmallCaliberWeapons extends AutomaticWeapon {

    private double caliber;
    private double sightingRange;
    private double weight;
    private int ammoStore;

    public SmallCaliberWeapons(String name, int yearOfIssue, double price) {
        super(name, yearOfIssue, price);
    }

    public SmallCaliberWeapons(String name, int yearOfIssue, double price, double caliber, double sightingRange, double weight, int ammoStore) {
        super(name, yearOfIssue, price);
        this.caliber = caliber;
        this.sightingRange = sightingRange;
        this.weight = weight;
        this.ammoStore = ammoStore;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public double getSightingRange() {
        return sightingRange;
    }

    public void setSightingRange(double sightingRange) {
        this.sightingRange = sightingRange;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAmmoStore() {
        return ammoStore;
    }

    public void setAmmoStore(int ammoStore) {
        this.ammoStore = ammoStore;
    }

    public abstract void clean();

    protected String chekCaliber() {
        return getCaliber() > 0.0 ? " калибра: " + getCaliber() + "." : " калибер данного атомата неизвестен.";
    }
}
