package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates the hierarchy of exceptions.
 * All exceptions are subclasses of Throwable.
 */
public class Ex03ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a general exception.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }

        try {
            throw new RuntimeException("This is a runtime exception.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
}
