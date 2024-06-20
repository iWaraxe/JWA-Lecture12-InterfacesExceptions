package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates the use of throws and throw keywords.
 * The throws keyword is used to declare an exception, while the throw keyword is used to throw an exception.
 */
public class Ex06ThrowsAndThrow {

    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void methodThatThrowsException() throws Exception {
        throw new Exception("This is an exception thrown by the method.");
    }
}
