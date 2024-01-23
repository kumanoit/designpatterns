package com.kumanoit.designpatterns.strategy.fourth;

import com.kumanoit.designpatterns.strategy.fourth.interfaces.FlyBehaviour;
import com.kumanoit.designpatterns.strategy.fourth.interfaces.QuackBehaviour;

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
