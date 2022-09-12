package org.homework4.weaponsAndSoldat.entity.weapon;

public final class Avtomate extends FireArms {
    private boolean muffler;
    private boolean firingMode;

    public Avtomate(String name, int yearOfIssue, double price) {
        super(name, yearOfIssue, price);
    }

    public Avtomate(String name, int yearOfIssue, double price, double caliber, double sightingRange, double weight, int ammoStore) {
        super(name, yearOfIssue, price, caliber, sightingRange, weight, ammoStore);
        this.muffler = false; // Не установлен
        this.firingMode = false; // Стрельба одиночными выстрелами
    }

    public boolean isMuffler() {
        return muffler;
    }

    public void setMuffler(boolean muffler) {
        this.muffler = muffler;
    }

    public boolean isFiringMode() {
        return firingMode;
    }

    public void setFiringMode(boolean firingMode) {
        this.firingMode = firingMode;
    }

    @Override
    public void clean() {
        System.out.println("Почистил автомат");
    }

    @Override
    public void oilTheWeapon() {
        System.out.println("Смазан автомата: " + getName());
    }

    @Override
    public void buy() {
        System.out.println("Вы купили автомат: " + getName() + chekCaliber() + " Его цена " + getPrice() + " USD");
    }

    @Override
    public void sell() {
        System.out.println("Вы продали автомат: " + getName() + chekCaliber());
    }

    @Override
    public void load() {
        System.out.println("Магазин автомата заряжен, количество патронов в нем составляет : " + getAmmoStore());
    }

    @Override
    public void reload() {
        System.out.println("Перезарядка магазина автомата закончена.");
    }

    public void switchShootingMode(boolean shootingMod) {
        this.firingMode = shootingMod;
        String result = firingMode ? "Режим стрельбы переключен на стрельбу очередью" : "Режим стрельбы переключен на стрельбу одиночными";
        System.out.println(result);
    }
}
