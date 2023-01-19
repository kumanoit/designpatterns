package com.kumanoit.designpatterns.strategy.second;

public class Duck {

    public void quack() {
        System.out.println("Quack");
    }
    public void swim() {
        System.out.println("Swims");
    }
    public void display() {
        System.out.println("Display");
    }

    /**
     * Adding a fly method in the base class leads all subclasses to inherit
     * it. Due to this even Rubber duck will fly now.
     */
    public void fly() {
        System.out.println("Fly");
    }
}
