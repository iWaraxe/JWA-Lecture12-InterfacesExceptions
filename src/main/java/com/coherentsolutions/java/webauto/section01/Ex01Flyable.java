package com.coherentsolutions.java.webauto.section01;

/**
 * The Flyable interface represents a contract for flying behavior.
 * Any class implementing this interface must provide an implementation
 * for the fly method.
 */
public interface Ex01Flyable {
    int SUPER_FLYABLE = 0;
    void fly();

    default void jetFly() {

    }
}
