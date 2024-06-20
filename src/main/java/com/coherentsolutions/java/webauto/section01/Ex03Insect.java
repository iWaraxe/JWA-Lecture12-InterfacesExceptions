package com.coherentsolutions.java.webauto.section01;

/**
 * The Insect class implements the Flyable interface.
 * This means Insect must provide an implementation for the fly method.
 */
public class Ex03Insect implements Ex01Flyable {

    @Override
    public void fly() {
        // Implementation of fly method
        System.out.println("Insect is flying!");
    }

    public static void main(String[] args) {
        Ex03Insect insect = new Ex03Insect();
        insect.fly();
    }
}
