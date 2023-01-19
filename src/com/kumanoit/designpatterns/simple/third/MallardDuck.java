package com.kumanoit.designpatterns.simple.third;

public class MallardDuck extends Duck implements FlyBehaviour, QuackBehaviour {

    @Override
    public void display() {
        System.out.println("Looks like a Mallard Duck");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck flies backward");
    }

    @Override
    public void quack() {
        System.out.println("Mallard duck quacks loud");
    }
}
