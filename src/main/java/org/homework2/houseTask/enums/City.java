package org.homework2.houseTask.enums;

public enum City {
    KIEV("Kiev"),
    ODESSA("Odessa"),
    ROVNO("Rovno");

    String city;

    City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
