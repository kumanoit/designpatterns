package com.kumanoit.designpatterns.singleton;

/**
 * This is a singleton class where at any instance there won't be more than one instance of this class available.
 *
 * Advantage:
 * 1. Only one object is created.
 * 2. The objects are created lazily which means an object will only be created if it is needed.
 *
 * Disadvantage:
 * 1. Making the method synchronized has its own downside. Once an object is created and multiple threads are
 * trying to get an instance of this class, then at a time only one thread will get inside the function and the
 * rest will wait.
 * 2. Making a method synchronized reduces the performance drastically.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton synchronizedSingleton;
    private SynchronizedSingleton() {
        // No external class can create an object of this class
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (synchronizedSingleton == null) {
            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }
}
