package org.homework4.weaponsAndArmy.entity.army;

public class Sniper extends Shooter {
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
    public void fight() {
        System.out.println("Снайпер воюет тихо.");
    }

    @Override
    public void toPlan() {
        System.out.println("Изучение местности.");
    }

    @Override
    public void completeCombatMission() {
        System.out.println("Миссия выполнена успешно.");
    }

    @Override
    public void rest() {
        System.out.println("Отдых после выполнения миссии.");
    }

    @Override
    public void workout() {
        System.out.println("Стрельба по мешеням.");
    }

    @Override
    public void preparationForDeparture() {
        System.out.println("Чистка оружия.");
    }

    @Override
    public void getMission() {
        System.out.println("Миссия получена.");
    }

    public void highGroundSearch() {
        System.out.println("Снайпер занял выгодную позицию на возвышенности.");
    }
}
