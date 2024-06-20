package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * The Bird class extends Animal and implements the Flyable interface.
 * This means Bird must provide implementations for the methods in Flyable.
 */
public class Ex02Bird extends Ex05Animal implements Ex01Flyable {
    private String name;
    private Color color;
    private int age;

    public Ex02Bird(String name, Color color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        // Implementation of eat method
    }

    @Override
    public void say() {
        // Implementation of say method
    }

    @Override
    public void fly() {
        // Implementation of fly method
        System.out.println("Bird is flying!");
    }

    public static void main(String[] args) {
        Ex02Bird bird = new Ex02Bird("Sparrow", Color.RED, 2);
        bird.fly();
    }
}
