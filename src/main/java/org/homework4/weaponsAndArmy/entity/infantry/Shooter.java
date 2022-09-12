package org.homework4.weaponsAndArmy.entity.infantry;

public abstract class Shooter extends Soldat {
    private String callSign;
    private String mascot;


    public Shooter(String name, String rank, String weapon) {
        super(name, rank, weapon);
    }

    public Shooter(String name, String rank, String weapon, String callSign, String mascot) {
        super(name, rank, weapon);
        this.callSign = callSign;
        this.mascot = mascot;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public abstract void preparationForDeparture();
}
