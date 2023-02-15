package org.example;

public class CarApplication {

    public static void main(String[] args) {
        Car toyota = new Car("toyota", "black", 2017);
        Car bmw = new Car("bmw", "red", 2021);
        Car volvo = new Car("volvo", "black", 2018);
        Car lada = new Car("lada", "white", 2016);
        Car audi = new Car("audi", "yellow", 2020);

        Person owner = new Person("Max", "Popov");

        Garage parking = new Garage(toyota, owner);
        parking.describe();
    }

}
