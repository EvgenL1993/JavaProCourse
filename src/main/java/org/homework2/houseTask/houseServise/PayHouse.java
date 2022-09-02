package org.homework2.houseTask.houseServise;

import org.homework2.houseTask.house.House;
import org.homework2.houseTask.payer.Payer;

public class PayHouse {

    public void payHouse(Payer payer, House house) {
        if (payer.getAge() < 18) {
            System.out.println("Данный покупатель не имеет юредического права купить дом. Его возраст составляет - " + payer.getAge() + " лет.");
        } else if (house.getCost() > payer.getBalance()) {
            System.out.println("Уважаемый покупатель ваших денег не достаточно для покупки этого дома, еще нужно поработать.");
        } else {
            changePayerBalance(payer, house);
            changeHouseStatus(payer, house);
            payer.addHouse(house);
            System.out.println("Мои поздравления вы становитесь счастливым обладателем " + house.getType() + ", стоимостью " +
                    house.getCost() + " " + house.getCurrency() + ". Пойдемте оформим документы");
            System.out.println("Баланс покупателя после сделки, составляет - " + payer.getBalance() + " . И он является владельцем дома:");
            showHouse(house);
        }
    }

    private void showHouse(House house) {
        System.out.println("Помещение типа " + house.getType() + ". " + "Расположен по адресу: Город - " + house.getCity() + ", " +
                "улица - " + house.getAddress() + ". Общей площадью - " + house.getArea() + " квадратных метров." +
                " Стоимостью - " + house.getCost() + " " + house.getCurrency());
    }

    private void changePayerBalance(Payer payer, House house) {
        payer.setBalance(payer.getBalance() - house.getCost());
    }

    private void changeHouseStatus(Payer payer, House house) {
        house.setStatus("Продан! Новый владелец: " + payer.getName() + " " + payer.getSerName());
    }
}
