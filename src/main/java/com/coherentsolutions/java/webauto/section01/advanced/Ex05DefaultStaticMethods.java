package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * The DefaultStaticMethods interface demonstrates the use of default and static methods in an interface.
 */
public interface Ex05DefaultStaticMethods {

    void performAction();

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class Ex06Implementation implements Ex05DefaultStaticMethods {

    @Override
    public void performAction() {
        System.out.println("Performing action.");
    }

    public static void main(String[] args) {
        Ex06Implementation impl = new Ex06Implementation();
        impl.performAction();
        impl.defaultMethod();
        Ex05DefaultStaticMethods.staticMethod();
    }
}
