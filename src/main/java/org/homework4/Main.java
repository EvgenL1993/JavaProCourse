package org.homework4;

import org.homework4.weaponsAndSoldat.entity.infantry.*;
import org.homework4.weaponsAndSoldat.entity.weapon.*;

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

        final SoldierSkills soldierSkills = new AssaultSoldier("Roril", "sergant", "M15");
        soldierSkills.fire();
        soldierSkills.takeAim();
        final Responsibilities responsibilities = new AssaultSoldier("Roril", "sergant", "M15");
        responsibilities.executeAnMission();
        responsibilities.rest();
        final PayWeapon payWeapon = new Avtomate("Example", 1993, 1000);
        payWeapon.buy();
        payWeapon.sell();
        final ActionWithWeapon actionWithWeapon = new Avtomate("Example", 1993, 1000);
        actionWithWeapon.load();
        actionWithWeapon.reload();

        final Weapons weapons = new Pistol("Example", 1993, 1000);
        weapons.oilTheWeapon();
        final FireArms fireArms = new Avtomate("Example", 1993, 1000);
        fireArms.clean();

        final Infantry infantry = new Sniper("Roril", "sergant", "M15");
        infantry.getMission();

        final Soldat soldat = new AssaultSoldier("Roril", "sergant", "M15");
        soldat.preparationForDeparture();


    }

}
