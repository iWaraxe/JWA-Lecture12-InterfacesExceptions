package com.coherentsolutions.java.webauto.section01;

/**
 * The Animal class is a superclass for various types of animals.
 */
public abstract class Ex05Animal {
    private String name;
    private Color color;
    private int age;

    public Ex05Animal(String name, Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void eat();

    public abstract void say();

    // Getters and setters for the fields can be added here
}
