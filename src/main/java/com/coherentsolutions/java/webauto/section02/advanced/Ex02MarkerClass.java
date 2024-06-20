package com.coherentsolutions.java.webauto.section02.advanced;

import java.awt.event.MouseListener;
import java.util.EventListener;

/**
 * Marker interface with no methods.
 */
interface Ex02MarkerInterface {
}

/**
 * Class implementing the marker interface.
 */
public class Ex02MarkerClass implements Ex02MarkerInterface {
    private String name;

    public Ex02MarkerClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Ex02MarkerClass markerClass = new Ex02MarkerClass("Example");
        if (markerClass instanceof Ex02MarkerInterface) {
            System.out.println(markerClass.getName() + " is an instance of MarkerInterface");
        }
    }
}
