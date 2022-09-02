package org.homework2;

import org.homework2.houseTask.enums.RoomType;
import org.homework2.houseTask.house.Furniture;
import org.homework2.houseTask.house.House;
import org.homework2.houseTask.enums.City;
import org.homework2.houseTask.enums.HouseType;
import org.homework2.houseTask.house.Room;
import org.homework2.houseTask.houseServise.PayHouse;
import org.homework2.houseTask.houseServise.ShowHouseAfterRenovation;
import org.homework2.houseTask.payer.Payer;
import org.homework2.houseTask.roomServise.MakeRoom;
import org.homework2.houseTask.roomServise.ShowRooms;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        PayHouse newPay = new PayHouse();
        MakeRoom makeRoom = new MakeRoom();
        ShowRooms showRooms = new ShowRooms();
        ShowHouseAfterRenovation showHouseAfterRenovation = new ShowHouseAfterRenovation();


        Payer payer = new Payer("Evgen", "Lyashenko", 20, true, 200000);
        House house = new House(HouseType.APARTMENT.getType(), City.KIEV.getCity(), "Borchagovka", 89, 150000, "USD");
        newPay.payHouse(payer, house);
        Room room = new Room(RoomType.SLEEPING.getType(), 36);
        makeRoom.makeRoom(room, house);

        List<Furniture> furnitures = new ArrayList<>();
        Furniture sofa = new Furniture("Sofa", "Cushioned", 2000, "red");
        Furniture bed = new Furniture("Bed", "Cushioned", 5000, "black");
        Furniture chair = new Furniture("Сhair", "Cushioned", 1500, "black");
        furnitures.add(sofa);
        furnitures.add(bed);
        furnitures.add(chair);
        makeRoom.installFurniture(room, furnitures);
        showHouseAfterRenovation.showHouseAfterRem(house);
        showRooms.showRooms(house.getRooms().get(0));
    }
}
