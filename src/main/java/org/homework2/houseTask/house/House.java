package org.homework2.houseTask.house;

import org.homework2.houseTask.room.Room;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String type;
    private String city;
    private String address;
    private Number area;
    private int price;
    private String currency;
    private String status;
    private final List<Room> rooms;

    public House(String type, String city, String address, Number area, int price, String currency) {
        this.type = type;
        this.city = city;
        this.address = address;
        this.area = area;
        this.price = price;
        this.currency = currency;
        this.status = "На продаже";
        this.rooms = new ArrayList<>();
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
