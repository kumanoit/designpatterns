package com.kumanoit.designpatterns.simple.fourth;

import com.kumanoit.designpatterns.simple.fourth.interfaces.FlyBehaviour;
import com.kumanoit.designpatterns.simple.fourth.interfaces.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("Swims");
    }

    public void display() {
        System.out.println("Display");
    }

}
