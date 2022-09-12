package org.homework4.weaponsAndSoldat.entity.weapon;

public abstract class AutomaticWeapon implements Firearms {

    private String name;
    private int yearOfIssue;
    private double price;

    public AutomaticWeapon(String name, int yearOfIssue, double price) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void oilTheWeapon();


}
