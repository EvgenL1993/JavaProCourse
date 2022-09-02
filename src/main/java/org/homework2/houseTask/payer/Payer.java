package org.homework2.houseTask.payer;

import org.homework2.houseTask.house.House;

import java.util.ArrayList;
import java.util.List;

public class Payer {
    private String name;
    private String serName;
    private int age;
    private boolean sex;
    private Integer balance;
    private List<House> houses = new ArrayList<>();

    public Payer(String name, String serName, int age, boolean sex, Integer balance) {
        this.name = name;
        this.serName = serName;
        this.age = age;
        this.sex = sex;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void addHouse(House house) {
        this.houses.add(house);
    }

    public List<House> getHouses() {
        return houses;
    }
}
