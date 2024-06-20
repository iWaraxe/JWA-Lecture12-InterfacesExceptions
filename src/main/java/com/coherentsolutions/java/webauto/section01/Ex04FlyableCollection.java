package com.coherentsolutions.java.webauto.section01;

import com.coherentsolutions.java.webauto.section01.advanced.Ex01Swimmable;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates using the Flyable interface as a type in a collection.
 */
public class Ex04FlyableCollection {
    public static void main(String[] args) {
        Ex02Bird bird1 = new Ex02Bird("Parrot", Color.RED, 2);
        Ex02Bird bird2 = new Ex02Bird("Crow", Color.BLACK, 3);
        Ex03Insect insect1 = new Ex03Insect();
        Ex03Insect insect2 = new Ex03Insect();
        Ex03Insect insect3 = new Ex03Insect();

        List<Ex01Flyable> flyableList = new ArrayList<>();
        flyableList.add(bird1);
        flyableList.add(bird2);
        flyableList.add(insect1);
        flyableList.add(insect2);
        flyableList.add(insect3);

        for (Ex01Flyable flyable : flyableList) {
            flyable.fly();
        }
    }
}
