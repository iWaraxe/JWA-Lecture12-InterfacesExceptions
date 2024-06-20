package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates the use of the finally block.
 * The finally block always executes, regardless of whether an exception is thrown.
 */
public class Ex07FinallyBlock {
    public static void main(String[] args) {
        int[] array = new int[2];
        try {
            System.out.println("Accessing third element: " + array[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        } finally {
            array[0] = 6;
            System.out.println("First element value: " + array[0]);
            System.out.println("The finally statement is executed.");
        }
    }
}
