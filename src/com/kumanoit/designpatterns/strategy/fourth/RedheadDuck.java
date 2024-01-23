package com.kumanoit.designpatterns.strategy.fourth;

import com.kumanoit.designpatterns.strategy.fourth.impl.FlyRocketPowered;
import com.kumanoit.designpatterns.strategy.fourth.impl.Squeak;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehaviour = new FlyRocketPowered();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Redhead duck");
    }

}
