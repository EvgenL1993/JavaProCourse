package org.homework4.weaponsAndSoldat.entity.infantry;

public abstract class Soldat extends Infantry {
    private String callSign;
    private String mascot;


    public Soldat(String name, String rank, String weapon) {
        super(name, rank, weapon);
    }

    public Soldat(String name, String rank, String weapon, String callSign, String mascot) {
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
