package org.homework2.houseTask.roomServise;

import org.homework2.houseTask.house.Furniture;
import org.homework2.houseTask.house.Room;

import java.util.List;

public class ShowRooms {
    public void showRooms(Room room) {
        System.out.println("Зайдя в комнату пожно увидеть такую мебель как: ");
        printFurniture(room.getFurniture());
    }

    private void printFurniture(List<Furniture> furniture) {
        for (Furniture furniture1 : furniture) {
            System.out.println("Название мебели - " + furniture1.getName() + "\n" + "Тип мебели - " + furniture1.getType() + "\n"
                    + "Цвет мебели - " + furniture1.getColor() + "\n" + "Цена мебели - " + furniture1.getCost());
        }
    }
}
