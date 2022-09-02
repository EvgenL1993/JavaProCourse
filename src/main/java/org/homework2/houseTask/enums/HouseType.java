package org.homework2.houseTask.enums;

public enum HouseType {
    APARTMENT("apartment"),
    PRIVATE_HOUSE("privateHouse");

    String type;

    HouseType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
