package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates an unchecked exception in Java.
 * An ArrayIndexOutOfBoundsException is thrown when trying to access an invalid array index.
 */
public class Ex02UncheckedException {
    public static void main(String[] args) {
        try {
            int[] array = new int[2];
            System.out.println("Accessing third element: " + array[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("Outside of block");
    }
}
