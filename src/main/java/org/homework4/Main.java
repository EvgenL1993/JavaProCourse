package org.homework4;

import org.homework4.weaponsAndArmy.entity.army.AssaultSoldier;
import org.homework4.weaponsAndArmy.entity.army.Scout;
import org.homework4.weaponsAndArmy.entity.army.Sniper;
import org.homework4.weaponsAndArmy.entity.weapon.Avtomate;
import org.homework4.weaponsAndArmy.entity.weapon.MachineGun;
import org.homework4.weaponsAndArmy.entity.weapon.Pistol;

public class Main {
    public static void main(String[] args) {

        Avtomate avtomate = new Avtomate("AK 47", 1993, 1000.50, 34.5, 300, 4.5, 30);
        avtomate.switchShootingMode(false);

        Pistol pistol = new Pistol("Макаров", 1994, 700, 9, 300, 1, 9, "Ukraina", "Кожанная");
        pistol.actionWithHolster(true);

        MachineGun machineGun = new MachineGun("Максим", 1980, 5400, 23, 400, 4.2, 60, true);
        machineGun.installGrenadeThrower(true);

        Sniper sniper = new Sniper("Кирил", "Лейтенант", "Снайперская винтовка", "Меткий глаз", "Монета", "Зеленый", "Андрей");
        sniper.highGroundSearch();

        Scout scout = new Scout("Джон", "Майор", "Пистолет", "Джон Вик", "Клевер", "Разширенная", "Кенон");
        scout.detectEnemyPositions();

        AssaultSoldier assaultSoldier = new AssaultSoldier("Sergey", "Полковник", "M64", "Пикачу", "Медальйон", "Кора", "Надежный, американского образца");
        assaultSoldier.hostageRelease();
    }

}
