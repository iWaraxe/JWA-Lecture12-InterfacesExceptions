package com.coherentsolutions.java.webauto.section03;

/**
 * Demonstrates multiple catch blocks.
 * Different types of exceptions are caught by different catch blocks.
 */
public class Ex04MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] array = new int[2];
            System.out.println("Accessing third element: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}
