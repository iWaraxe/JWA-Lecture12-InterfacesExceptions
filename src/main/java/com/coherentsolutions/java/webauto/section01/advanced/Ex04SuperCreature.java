package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * The SuperCreature class implements the FlyableSwimmable interface.
 * This means SuperCreature must provide implementations for both
 * the fly and swim methods.
 */
public class Ex04SuperCreature implements Ex03FlyableSwimmable {

    @Override
    public void fly() {
        System.out.println("SuperCreature is flying!");
    }

    @Override
    public void swim() {
        System.out.println("SuperCreature is swimming!");
    }

    public static void main(String[] args) {
        Ex04SuperCreature superCreature = new Ex04SuperCreature();
        superCreature.fly();
        superCreature.swim();
    }
}
