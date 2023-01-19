package com.kumanoit.designpatterns.singleton;

/**
 * This is a singleton class where at any instance there won't be more than one instance of this class available.
 *
 * Advantage:
 * 1. Only one object is created.
 * 2. The objects are created lazily which means an object will only be created if it is needed.
 * 3. Thread safe
 *
 * Disadvantage:
 * 1. Handling mutliple threads looks like an overkill. Use it if it is really needed.
 */
public class DoubleCheckedLockingSynchronizationSingleton {

    private volatile static DoubleCheckedLockingSynchronizationSingleton instance;

    private DoubleCheckedLockingSynchronizationSingleton() {
        // No external class can create an object of this class
    }

    public static DoubleCheckedLockingSynchronizationSingleton getInstance() {
        // this check is needed to ensure that we need to create an object
        if (instance == null) {
            // synchronization will ensure that no two thread get inside to create an object
            synchronized (DoubleCheckedLockingSynchronizationSingleton.class) {
                // the below check is needed for handling cases where more than one thread has passed the instance null
                // check above synchronized. So, it might be possible that say thread1 get here, check for null
                // finds that instance is null and creates an object. Now, thread2 enters, and had the below instance
                // null check is not there then it will create another object.
                if (instance == null) {
                    instance = new DoubleCheckedLockingSynchronizationSingleton();
                }
            }
        }
        return instance;
    }
}
