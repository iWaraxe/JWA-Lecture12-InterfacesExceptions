package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Interface representing flying behavior.
 */
interface Ex01Flyable {
    void fly();
}

/**
 * Interface representing swimming behavior.
 */
interface Ex01Swimmable {
    void swim();
}

/**
 * Interface extending multiple interfaces.
 */
interface Ex01FlyableSwimmable extends Ex01Flyable, Ex01Swimmable {
}

/**
 * Class implementing the interface that extends multiple interfaces.
 */
public class Ex01SuperCreature implements Ex01FlyableSwimmable {

    @Override
    public void fly() {
        System.out.println("SuperCreature is flying!");
    }

    @Override
    public void swim() {
        System.out.println("SuperCreature is swimming!");
    }

    public static void main(String[] args) {
        Ex01SuperCreature superCreature = new Ex01SuperCreature();
        superCreature.fly();
        superCreature.swim();
    }
}
