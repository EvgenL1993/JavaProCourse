package org.homework2.houseTask.houseServise;

import org.homework2.houseTask.house.House;

public class ShowHouseAfterRenovation {

    public void showHouseAfterRem(House house) {
        System.out.println("После покупки и ремонта, дом имеет следующие характеристики:\n" +
                "Количество комнат = " + house.getRooms().size() + "\n" + "Комната типа = " + house.getRooms().get(0).getType() + "\n" +
                "Статус дома - " + house.getStatus());
    }
}
