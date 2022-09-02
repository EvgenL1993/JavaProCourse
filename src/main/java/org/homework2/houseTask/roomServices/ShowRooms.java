package org.homework2.houseTask.roomServices;

import org.homework2.houseTask.furniture.Furniture;
import org.homework2.houseTask.room.Room;

import java.util.List;

public class ShowRooms {
    public void showRooms(Room room) {
        System.out.println("Зайдя в комнату можно увидеть такую мебель как: ");
        printFurniture(room.getFurniture());
    }

    private void printFurniture(List<Furniture> furniture) {
        for (Furniture furniture1 : furniture) {
            System.out.println("Название мебели - " + furniture1.getName() + "\n" + "Тип мебели - " + furniture1.getType() + "\n"
                    + "Цвет мебели - " + furniture1.getColor() + "\n" + "Цена мебели - " + furniture1.getPrice());
        }
    }
}
