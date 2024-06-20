package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * The Fish class implements the Swimmable interface.
 * This means Fish must provide an implementation for the swim method.
 */
public class Ex02Fish implements Ex01Swimmable {

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    public static void main(String[] args) {
        Ex02Fish fish = new Ex02Fish();
        fish.swim();
    }
}
