package org.homework2.houseTask.house;

public class Furniture {

    private String name;
    private String type;
    private int cost;
    private String color;

    public Furniture(String name, String type, int cost, String color) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
