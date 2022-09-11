package org.homework4.weaponsAndArmy.entity.weapon;

public class MachineGun extends SmallCaliberWeapons {

    private boolean machineGunStand;
    private boolean grenadeThrower;

    public MachineGun(String name, int yearOfIssue, double price) {
        super(name, yearOfIssue, price);
    }

    public MachineGun(String name, int yearOfIssue, double price, double caliber, double sightingRange, double weight, int ammoStore) {
        super(name, yearOfIssue, price, caliber, sightingRange, weight, ammoStore);
    }

    public MachineGun(String name, int yearOfIssue, double price, double caliber, double sightingRange, double weight, int ammoStore, boolean grenadeThrower) {
        super(name, yearOfIssue, price, caliber, sightingRange, weight, ammoStore);
        this.machineGunStand = false;
        this.grenadeThrower = grenadeThrower;
    }

    public boolean isMachineGunStand() {
        return machineGunStand;
    }

    public void setMachineGunStand(boolean machineGunStand) {
        this.machineGunStand = machineGunStand;
    }

    public boolean isGrenadeThrower() {
        return grenadeThrower;
    }

    public void setGrenadeThrower(boolean grenadeThrower) {
        this.grenadeThrower = grenadeThrower;
    }

    @Override
    public void takeAim() {
        System.out.println("Прицеливание с пулимета: " + getName());
    }

    @Override
    public void fire() {
        System.out.println("Огонь ведеться с пулимета: " + getName() + chekCaliber());
    }

    @Override
    public void buy() {
        System.out.println("Вы купили пулимет: " + getName() + chekCaliber() + " Его цена " + getPrice() + " USD");
    }

    @Override
    public void sell() {
        System.out.println("Вы продали пулимет: " + getName() + chekCaliber());
    }

    @Override
    public void load() {
        System.out.println("Магазин заряжен, количество патронов в нем составляет : " + getAmmoStore());
    }

    @Override
    public void reload() {
        System.out.println("Перезарядка магазина закончена.");
    }

    public void installGrenadeThrower(boolean value) {
        String result = value ? "Подставка для пулемета установлена." : "Подставка для пулемета убрана.";
        System.out.println(result);
    }
}
