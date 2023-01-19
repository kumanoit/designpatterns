package com.kumanoit.designpatterns.singleton;

/**
 * This is a simple singleton class where at any instance there won't be more than one instance of this class available.
 *
 * Advantage:
 * 1. Only one object is created.
 * 2. Thread safety as the object is already created statically. So, all thread will get the same object instance.
 *
 * Disadvantage:
 * 1. The object is created all the time when the application bootstraps. The problem is - it might be
 * possible that if this is resource intensive object then it will be created all the times irrespective of whether
 * it is needed or not. Another example is that say you have several service classes which are singleton and say that
 * those classes are for creating different types of notifications (ex sms, whatsapp, telegram etc). Now, different
 * countries will have different types of notifications channels. Ex Line is heavily used in the Philippines and whatsapp
 * in India. So, if I deploy this service in both countries then it is rarely a chance that whatsapp/telegram is used
 * in the Philippines but an object will be created.
 */
public class SimpleSingleton {
    private static final SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton() {
        // No external class can create an object of this class
    }

    private SimpleSingleton getInstance() {
        return instance;
    }
}
