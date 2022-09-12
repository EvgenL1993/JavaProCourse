package org.homework4;

import org.homework4.weaponsAndArmy.entity.infantry.*;
import org.homework4.weaponsAndArmy.entity.weapon.*;

public class Main {
    public static void main(String[] args) {

        final Avtomate avtomate = new Avtomate("AK 47", 1993, 1000.50, 34.5, 300, 4.5, 30);
        avtomate.switchShootingMode(false);

        final Pistol pistol = new Pistol("Макаров", 1994, 700, 9, 300, 1, 9, "Ukraina", "Кожанная");
        pistol.actionWithHolster(true);

        final MachineGun machineGun = new MachineGun("Максим", 1980, 5400, 23, 400, 4.2, 60, true);
        machineGun.installGrenadeThrower(true);

        final Sniper sniper = new Sniper("Кирил", "Лейтенант", "Снайперская винтовка", "Меткий глаз", "Монета", "Зеленый", "Андрей");
        sniper.highGroundSearch();

        final Scout scout = new Scout("Джон", "Майор", "Пистолет", "Джон Вик", "Клевер", "Разширенная", "Кенон");
        scout.detectEnemyPositions();

        final AssaultSoldier assaultSoldier = new AssaultSoldier("Sergey", "Полковник", "M64", "Пикачу", "Медальйон", "Кора", "Надежный, американского образца");
        assaultSoldier.hostageRelease();

        final SoldierSkills firstSoldat = new AssaultSoldier("Roril", "sergant", "M15");
        firstSoldat.fire();
        firstSoldat.takeAim();
        final Responsibilities secondSoldat = new AssaultSoldier("Roril", "sergant", "M15");
        secondSoldat.executeAnMission();
        secondSoldat.rest();
        final Weapon firstWeapon = new Avtomate("Example", 1993, 1000);
        firstWeapon.buy();
        firstWeapon.sell();
        final Firearms secondWeapon = new Avtomate("Example", 1993, 1000);
        secondWeapon.load();
        secondWeapon.reload();

        final AutomaticWeapon automaticWeapon = new Pistol("Example", 1993, 1000);
        automaticWeapon.oilTheWeapon();
        final SmallCaliberWeapons smallCaliberWeapons = new Avtomate("Example", 1993, 1000);
        smallCaliberWeapons.clean();

        final Infantry infantry = new Sniper("Roril", "sergant", "M15");
        infantry.getMission();

        final Soldat soldat = new AssaultSoldier("Roril", "sergant", "M15");
        soldat.preparationForDeparture();


    }

}
