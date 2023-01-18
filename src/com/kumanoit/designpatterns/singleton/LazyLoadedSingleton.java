package com.kumanoit.designpatterns.singleton;

/**
 * This is a singleton class where at any instance there won't be more than one instance of this class available.
 *
 * Advantage:
 * 1. The objects are created lazily which means an object will only be created if it is needed.
 *
 * Disadvantage:
 * 1. Not a singleton class. No thread safety as the object is created on the fly. So, if two threads call
 * getInstance() method at the same time and say that they check condition on line #22 together so they
 * both will enter the if block and create 2 threads.
 */
public class LazyLoadedSingleton {

    private static LazyLoadedSingleton lazyLoadedSingleton;
    private LazyLoadedSingleton() {
        // No external class can create an object of this class
    }

    public static LazyLoadedSingleton getInstance() {
        if (lazyLoadedSingleton == null) {
            lazyLoadedSingleton = new LazyLoadedSingleton();
        }
        return lazyLoadedSingleton;
    }
}
