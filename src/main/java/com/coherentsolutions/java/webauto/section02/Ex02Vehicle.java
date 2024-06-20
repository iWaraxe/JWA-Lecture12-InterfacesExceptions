package com.coherentsolutions.java.webauto.section02;

/**
 * Interface for driving behavior.
 */
interface Ex02Drivable {
    void drive();
}

/**
 * Interface for flying behavior.
 */
interface Ex02Flyable {
    void fly();
}

/**
 * Class implementing multiple interfaces.
 */
public class Ex02Vehicle implements Ex02Drivable, Ex02Flyable {

    @Override
    public void drive() {
        System.out.println("Driving the vehicle.");
    }

    @Override
    public void fly() {
        System.out.println("Flying the vehicle.");
    }

    public static void main(String[] args) {
        Ex02Vehicle vehicle = new Ex02Vehicle();
        vehicle.drive();
        vehicle.fly();
    }
}
