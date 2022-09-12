package org.homework4;

import org.homework4.weaponsAndArmy.Army;
import org.homework4.weaponsAndArmy.Firearms;
import org.homework4.weaponsAndArmy.Infantry;
import org.homework4.weaponsAndArmy.Weapon;
import org.homework4.weaponsAndArmy.entity.infantry.*;
import org.homework4.weaponsAndArmy.entity.weapon.*;

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

        Army firstSoldat = new AssaultSoldier("Roril", "sergant", "M15");
        firstSoldat.fight();
        firstSoldat.toPlan();
        Infantry secondSoldat = new AssaultSoldier("Roril", "sergant", "M15");
        secondSoldat.completeCombatMission();
        secondSoldat.rest();
        Weapon firstWeapon = new Avtomate("Example", 1993, 1000);
        firstWeapon.buy();
        firstWeapon.sell();
        Firearms secondWeapon = new Avtomate("Example", 1993, 1000);
        secondWeapon.fire();
        secondWeapon.load();
        secondWeapon.reload();

        AutomaticWeapon automaticWeapon = new Pistol("Example", 1993, 1000);
        automaticWeapon.takeAim();
        SmallCaliberWeapons smallCaliberWeapons = new Avtomate("Example", 1993, 1000);
        smallCaliberWeapons.clean();

        Soldat soldat = new Sniper("Roril", "sergant", "M15");
        soldat.getMission();

        Shooter shooter = new AssaultSoldier("Roril", "sergant", "M15");
        shooter.preparationForDeparture();


    }

}
