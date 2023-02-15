package org.example;

public class Car {

    public String brand;
    public String color;
    public Integer age;

    public Car(String brand, String color, Integer age) {
        this.age = age;
        this.color = color;
        this.brand = brand;
    }

    public void describe() {
        System.out.printf("I am %s, my color is %s, my age is %d.", brand, color, age);
    }

}
