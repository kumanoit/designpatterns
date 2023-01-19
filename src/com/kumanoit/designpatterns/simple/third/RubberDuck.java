package com.kumanoit.designpatterns.simple.third;

public class RubberDuck extends Duck implements FlyBehaviour, QuackBehaviour {

    @Override
    public void display() {
        System.out.println("Looks like a Rubber duck");
    }

    @Override
    public void fly() {
        System.out.println("Rubber duck can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Rubber duck can't quack");
    }
}
