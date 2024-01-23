package com.kumanoit.designpatterns.strategy.fourth;

import com.kumanoit.designpatterns.strategy.fourth.impl.FlyWithWings;
import com.kumanoit.designpatterns.strategy.fourth.impl.Quack;

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
