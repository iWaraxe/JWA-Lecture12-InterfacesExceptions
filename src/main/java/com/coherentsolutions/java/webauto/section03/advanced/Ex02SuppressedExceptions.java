package com.coherentsolutions.java.webauto.section03.advanced;

/**
 * Demonstrates the use of suppressed exceptions.
 * Suppressed exceptions are additional exceptions that occur during the handling of another exception.
 */
public class Ex02SuppressedExceptions {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.useResource();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed Exception: " + suppressed);
            }
        }
    }
}

class MyResource implements AutoCloseable {
    public void useResource() throws Exception {
        throw new Exception("Exception in useResource");
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Exception in close");
    }
}
