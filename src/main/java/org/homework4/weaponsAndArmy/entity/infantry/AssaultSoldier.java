package org.homework4.weaponsAndArmy.entity.infantry;

public final class AssaultSoldier extends Shooter {
    private String bodyArmor;
    private String helmet;

    public AssaultSoldier(String name, String rank, String weapon) {
        super(name, rank, weapon);
    }

    public AssaultSoldier(String name, String rank, String weapon, String callSign, String mascot) {
        super(name, rank, weapon, callSign, mascot);
    }

    public AssaultSoldier(String name, String rank, String weapon, String callSign, String mascot, String bodyArmor, String helmet) {
        super(name, rank, weapon, callSign, mascot);
        this.bodyArmor = bodyArmor;
        this.helmet = helmet;
    }

    public String getBodyArmor() {
        return bodyArmor;
    }

    public void setBodyArmor(String bodyArmor) {
        this.bodyArmor = bodyArmor;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    @Override
    public void fight() {
        System.out.println("Штурмовые солдаты идут первыми.");
    }

    @Override
    public void toPlan() {
        System.out.println("Изучение местности штурмовым солдатом.");
    }

    @Override
    public void completeCombatMission() {
        System.out.println("Миссия выполнена штурмовым солдатом - успешно.");
    }

    @Override
    public void rest() {
        System.out.println("Отдых после выполнения миссии штурмовым солдатом.");
    }

    @Override
    public void workout() {
        System.out.println("Стрельба по мешеням. Силовые тренировки штурмовым солдатом.");
    }

    @Override
    public void preparationForDeparture() {
        System.out.println("Чистка оружия штурмовым солдатом.");
    }

    @Override
    public void getMission() {
        System.out.println("Миссия получена штурмовым солдатом.");
    }
    public void hostageRelease(){
        System.out.println("Заложники освобождены штурмовым солдатом. Все целы и здоровы");
    }
}
