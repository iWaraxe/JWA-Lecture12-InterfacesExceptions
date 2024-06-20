package com.coherentsolutions.java.webauto.section02;

/**
 * Parent interface.
 */
interface Ex03Animal {
    void eat();
}

/**
 * Child interface extending the parent interface.
 */
interface Ex03Bird extends Ex03Animal {
    void fly();
}

/**
 * Class implementing the child interface.
 */
public class Ex03Sparrow implements Ex03Bird {

    @Override
    public void eat() {
        System.out.println("Sparrow is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }

    public static void main(String[] args) {
        Ex03Sparrow sparrow = new Ex03Sparrow();
        sparrow.eat();
        sparrow.fly();
    }
}
