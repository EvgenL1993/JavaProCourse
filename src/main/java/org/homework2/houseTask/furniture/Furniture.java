package org.homework2.houseTask.furniture;

public class Furniture {

    private String name;
    private String type;
    private int price;
    private String color;

    public Furniture(String name, String type, int price, String color) {
        this.name = name;
        this.type = type;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
