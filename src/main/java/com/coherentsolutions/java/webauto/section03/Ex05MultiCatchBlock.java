package com.coherentsolutions.java.webauto.section03;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Demonstrates multi-catch block.
 * Multiple exceptions can be caught by a single catch block.
 */
public class Ex05MultiCatchBlock {
    public static void main(String[] args) {
        double randomValue = Math.random();
        try {
            // some code that throws Runtime or IOException
            if (randomValue < 0.5) {
                throw new IOException("IO exception occurred");
            }

            if (randomValue > 0.5) {
                throw new RuntimeException("Runtime exception occurred");
            }
        } catch (IOException | RuntimeException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
