package org.homework2.houseTask.roomServices;

import org.homework2.houseTask.furniture.Furniture;
import org.homework2.houseTask.house.House;
import org.homework2.houseTask.room.Room;

import java.util.List;

public class MakeRoom {
    public void makeRoom(Room room, House house) {
        house.setRooms(room);
    }

    public void installFurniture(Room room, List<Furniture> furniture) {
        room.addFurniture((furniture));
    }
}
