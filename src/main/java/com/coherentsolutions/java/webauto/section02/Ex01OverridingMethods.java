package com.coherentsolutions.java.webauto.section02;

/**
 * Interface defining a method that throws an exception.
 */
public interface Ex01OverridingMethods {
    void performAction() throws Exception;
}

/**
 * Abstract class implementing the interface without providing method implementation.
 */
abstract class AbstractPerformer implements Ex01OverridingMethods {
    // Abstract class can leave the method unimplemented.
}

/**
 * Concrete class implementing the interface and providing method implementation.
 */
class Performer extends AbstractPerformer {

    @Override
    public void performAction() throws Exception {
        System.out.println("Performing action!");
    }

    public static void main(String[] args) {
        Performer performer = new Performer();
        try {
            performer.performAction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
