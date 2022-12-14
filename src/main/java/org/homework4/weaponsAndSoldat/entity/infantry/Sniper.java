package org.homework4.weaponsAndSoldat.entity.infantry;

public final class Sniper extends Soldat {
    private String camouflageSuit;
    private String fireSpotter;


    public Sniper(String name, String rank, String weapon) {
        super(name, rank, weapon);
    }

    public Sniper(String name, String rank, String weapon, String callSign, String mascot) {
        super(name, rank, weapon, callSign, mascot);
    }

    public Sniper(String name, String rank, String weapon, String callSign, String mascot, String camouflageSuit, String fireSpotter) {
        super(name, rank, weapon, callSign, mascot);
        this.camouflageSuit = camouflageSuit;
        this.fireSpotter = fireSpotter;
    }

    public String getCamouflageSuit() {
        return camouflageSuit;
    }

    public void setCamouflageSuit(String camouflageSuit) {
        this.camouflageSuit = camouflageSuit;
    }

    public String getFireSpotter() {
        return fireSpotter;
    }

    public void setFireSpotter(String fireSpotter) {
        this.fireSpotter = fireSpotter;
    }

    @Override
    public void fire() {
        System.out.println("Снайпер стреляет с далека. Используя " + getWeapon());
    }

    @Override
    public void takeAim() {
        System.out.println("Снайпер выполнил прицеливание в оптичиский прицел.");
    }

    @Override
    public void executeAnMission() {
        System.out.println("Миссия выполнена успешно снайпером.");
    }

    @Override
    public void rest() {
        System.out.println("Отдых после выполнения миссии снайпером.");
    }

    @Override
    public void workout() {
        System.out.println("Стрельба по мешеням снайпером с большой дистанции.");
    }

    @Override
    public void preparationForDeparture() {
        System.out.println("Чистка оружия снайпером.");
    }

    @Override
    public void getMission() {
        System.out.println("Миссия получена снайпером.");
    }

    public void highGroundSearch() {
        System.out.println("Снайпер занял выгодную позицию на возвышенности.");
    }
}
