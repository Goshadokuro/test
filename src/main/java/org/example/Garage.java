package org.example;

import org.example.Car;

public class Garage {

    public Car car;
    public Person person;

    public Garage(Car car, Person person) {
        this.car = car;
        this.person = person;
    }

    public void describe() {
        System.out.printf("The Garage belongs to, %s %s, car is %s %s.", person.firstName, person.secondName, car.color, car.brand);
    }
}
