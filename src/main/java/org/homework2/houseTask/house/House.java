package org.homework2.houseTask.house;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String type;
    private String city;
    private String address;
    private Number area;
    private Integer cost;
    private String currency;
    private String status;
    private List<Room> rooms = new ArrayList<>();

    public House(String type, String city, String address, Number area, Integer cost, String currency) {
        this.type = type;
        this.city = city;
        this.address = address;
        this.area = area;
        this.cost = cost;
        this.currency = currency;
        this.status = "На продаже";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Number getArea() {
        return area;
    }

    public void setArea(Number area) {
        this.area = area;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms.add(rooms);
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
