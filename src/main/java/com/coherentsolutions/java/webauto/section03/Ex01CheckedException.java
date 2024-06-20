package com.coherentsolutions.java.webauto.section03;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

/**
 * Demonstrates a checked exception in Java.
 * The FileReader constructor throws a FileNotFoundException if the file does not exist.
 */
public class Ex01CheckedException {
    public static void main(String[] args) {
        try {
            File f = new File("D://java/file.txt");
            FileReader fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("Outside of block");
    }
}
