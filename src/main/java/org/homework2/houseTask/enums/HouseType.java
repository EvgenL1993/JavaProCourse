package org.homework2.houseTask.enums;

public enum HouseType {
    APARTMENT("apartament"),
    PRIVATE_HOUSE("private_house");

    String type;

    HouseType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
