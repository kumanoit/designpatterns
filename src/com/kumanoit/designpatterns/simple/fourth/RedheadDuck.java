package com.kumanoit.designpatterns.simple.fourth;

import com.kumanoit.designpatterns.simple.fourth.impl.FlyRocketPowered;
import com.kumanoit.designpatterns.simple.fourth.impl.Squeak;

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
