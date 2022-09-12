package org.homework4.weaponsAndArmy.entity.weapon;

public final class Pistol extends SmallCaliberWeapons {

    private String producingCountry;
    private String holster;

    public Pistol(String name, int yearOfIssue, double price) {
        super(name, yearOfIssue, price);
    }

    public Pistol(String name, int yearOfIssue, double price, double caliber, double sightingRange, double weight, int ammoStore) {
        super(name, yearOfIssue, price, caliber, sightingRange, weight, ammoStore);
    }

    public Pistol(String name, int yearOfIssue, double price, double caliber, double sightingRange, double weight, int ammoStore, String producingCountry, String holster) {
        super(name, yearOfIssue, price, caliber, sightingRange, weight, ammoStore);
        this.producingCountry = producingCountry;
        this.holster = holster;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getHolster() {
        return holster;
    }

    public void setHolster(String holster) {
        this.holster = holster;
    }


    @Override
    public void clean() {
        System.out.println("Почистил пистолет");
    }

    @Override
    public void takeAim() {
        System.out.println("Прицеливание с пистолета: " + getName());
    }

    @Override
    public void fire() {
        System.out.println("Огонь ведеться с пистолета: " + getName() + chekCaliber());
    }

    @Override
    public void buy() {
        System.out.println("Вы купили пистолет: " + getName() + chekCaliber() + " Его цена " + getPrice() + " USD");
    }

    @Override
    public void sell() {
        System.out.println("Вы продали пистолет: " + getName() + chekCaliber());
    }

    @Override
    public void load() {
        System.out.println("Магазин пистолета заряжен, количество патронов в нем составляет : " + getAmmoStore());
    }

    @Override
    public void reload() {
        System.out.println("Перезарядка магазина пистолета закончена.");
    }

    public void actionWithHolster(Boolean actionWithHolster) {
        String result = actionWithHolster ? "Достал писталет с кабуры." : "Положил пистолет в кабуру.";
        System.out.println(result);
    }
}
