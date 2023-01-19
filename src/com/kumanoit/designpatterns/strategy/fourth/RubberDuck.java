package com.kumanoit.designpatterns.strategy.fourth;

import com.kumanoit.designpatterns.strategy.fourth.impl.FlyNoWay;
import com.kumanoit.designpatterns.strategy.fourth.impl.MuteQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Rubber duck");
    }

}
