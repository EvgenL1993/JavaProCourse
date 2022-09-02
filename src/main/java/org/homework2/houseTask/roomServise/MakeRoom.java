package org.homework2.houseTask.roomServise;

import org.homework2.houseTask.house.Furniture;
import org.homework2.houseTask.house.House;
import org.homework2.houseTask.house.Room;

import java.util.List;

public class MakeRoom {
    public void makeRoom(Room room, House house) {
        house.setRooms(room);
    }

    public void installFurniture(Room room, List<Furniture> furniture) {
        room.addFurniture((furniture));
    }
}
