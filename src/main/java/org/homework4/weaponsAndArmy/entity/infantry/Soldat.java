package org.homework4.weaponsAndArmy.entity.infantry;

import org.homework4.weaponsAndArmy.Infantry;
import org.homework4.weaponsAndArmy.Workout;

public abstract class Soldat implements Infantry, Workout {

    private String name;
    private String rank;
    private String weapon;

    public Soldat(String name, String rank, String weapon) {
        this.name = name;
        this.rank = rank;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public abstract void getMission();
}
