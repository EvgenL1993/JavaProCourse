package org.homework2.houseTask.roomServices;

import org.homework2.houseTask.furniture.Furniture;
import org.homework2.houseTask.house.House;
import org.homework2.houseTask.room.Room;

import java.util.List;

public class MakeRoom {
    public void makeRoom(Room room, House house) {
        if (house.getStatus().equals("На продаже")) {
            System.out.println("К сожалению вы не смогли купить дом. У вас нет права делать в нем ремонт");
        } else {
            house.setRooms(room);
            room.setStatus("Добавлено");
            System.out.println(room.getType() + " комната построена!");
        }
    }

    public void installFurniture(Room room, List<Furniture> furniture) {
        if (room.getStatus().equals("Не добавлена")) {
            System.out.println("Комната не построена. Куда ты собрался добавлять мебель?");
        } else {
            room.addFurniture((furniture));
        }
    }
}
