package com.kumanoit.designpatterns.simple.fourth;

import com.kumanoit.designpatterns.simple.fourth.impl.FlyWithWings;
import com.kumanoit.designpatterns.simple.fourth.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Looks like a Mallard Duck");
    }

}
