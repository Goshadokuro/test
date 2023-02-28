package org.example;

public class CarApplication {

    public static void main(String[] args) {
        Car toyota = new Car("toyota", "black", 2017);
        Car bmw = new Car("bmw", "red", 2021);
        Car mazda = new Car("mazda", "black", 2018);
        Car lada = new Car("lada", "white", 2016);
        Car uaz = new Car("uaz", "yellow", 2020);

        Person owner = new Person("Max", "Popov");

        Garage parking = new Garage(toyota, owner);
        parking.describe();
    }

}
