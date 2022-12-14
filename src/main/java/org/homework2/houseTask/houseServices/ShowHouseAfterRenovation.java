package org.homework2.houseTask.houseServices;

import org.homework2.houseTask.house.House;

public class ShowHouseAfterRenovation {

    public void showHouseAfterRenovation(House house) {
        if (house.getRooms().isEmpty()) {
            System.out.println("Дом не был куплен!!");
        } else {
            System.out.println("После покупки и ремонта, дом имеет следующие характеристики:\n" +
                    "Количество комнат = " + house.getRooms().size() + "\n" + "Комната типа = " + house.getRooms().get(0).getType() + "\n" +
                    "Статус дома - " + house.getStatus());
        }
    }
}
