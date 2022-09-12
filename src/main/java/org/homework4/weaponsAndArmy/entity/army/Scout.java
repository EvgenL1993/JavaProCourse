package org.homework4.weaponsAndArmy.entity.army;

public final class Scout extends Shooter {
    private String map;
    private String camera;

    public Scout(String name, String rank, String weapon) {
        super(name, rank, weapon);
    }

    public Scout(String name, String rank, String weapon, String callSign, String mascot) {
        super(name, rank, weapon, callSign, mascot);
    }

    public Scout(String name, String rank, String weapon, String callSign, String mascot, String map, String camera) {
        super(name, rank, weapon, callSign, mascot);
        this.map = map;
        this.camera = camera;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public void fight() {
        System.out.println("Разведчики воюют крайне редко");
    }

    @Override
    public void toPlan() {
        System.out.println("Изучение местности разведчиком.");
    }

    @Override
    public void completeCombatMission() {
        System.out.println("Миссия разведчиком выполнена успешно.");
    }

    @Override
    public void rest() {
        System.out.println("Отдых после выполнения миссии разведчиком.");
    }

    @Override
    public void workout() {
        System.out.println("Тренировка для разведчика. Стрельба по мешеням. Бег.");
    }

    @Override
    public void preparationForDeparture() {
        System.out.println("Подготовка средств навигации разведчиком");
    }

    @Override
    public void getMission() {
        System.out.println("Миссия получена разведчиком.");
    }

    public void detectEnemyPositions() {
        System.out.println("Позиции врага обнаружены разведчиком.");
    }
}
