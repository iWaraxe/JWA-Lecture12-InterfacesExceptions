package com.coherentsolutions.java.webauto.section03.advanced;

/**
 * Advanced custom exception demonstrating chained exceptions.
 */
public class Ex01AdvancedCustomException extends Exception {
    public Ex01AdvancedCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Ex01AdvancedCustomException e) {
            System.out.println("Caught Exception: " + e);
            e.printStackTrace();
        }
    }

    public static void method1() throws Ex01AdvancedCustomException {
        try {
            method2();
        } catch (Exception e) {
            throw new Ex01AdvancedCustomException("Exception in method1", e);
        }
    }

    public static void method2() throws Exception {
        throw new Exception("Exception in method2");
    }
}
