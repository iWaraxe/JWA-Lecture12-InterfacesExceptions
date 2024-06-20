package com.coherentsolutions.java.webauto.section01.advanced;

import com.coherentsolutions.java.webauto.section01.Ex01Flyable;

/**
 * The FlyableSwimmable interface extends both Flyable and Swimmable interfaces.
 * Any class implementing this interface must provide implementations for
 * both the fly and swim methods.
 */
public interface Ex03FlyableSwimmable extends Ex01Swimmable, Ex01Flyable {
}
