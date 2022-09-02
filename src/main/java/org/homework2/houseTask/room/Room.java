package org.homework2.houseTask.room;

import org.homework2.houseTask.furniture.Furniture;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String type;
    private int area;
    private String status;
    private final List<Furniture> furniture;


    public Room(String type, int area) {
        this.type = type;
        this.area = area;
        this.status = "Не добавлена";
        this.furniture = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void addFurniture(List<Furniture> furniture) {
        this.furniture.addAll(furniture);
    }

    public List<Furniture> getFurniture() {
        return furniture;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

