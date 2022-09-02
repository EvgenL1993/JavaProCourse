package org.homework2.houseTask.enums;

public enum RoomType {
    CHILDREN("Children"),
    SLEEPING("sleeping"),
    BATHROOM("bathroom");

    String type;

    RoomType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
