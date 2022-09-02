package org.homework2.houseTask.furniture;

public class SoftFurniture extends Furniture {
    private double size;

    public SoftFurniture(String name, String type, int price, String color) {
        super(name, type, price, color);
    }

    public SoftFurniture(String name, String type, int price, String color, double size) {
        super(name, type, price, color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
