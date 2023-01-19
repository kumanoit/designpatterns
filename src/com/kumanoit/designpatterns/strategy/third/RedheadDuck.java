package com.kumanoit.designpatterns.strategy.third;

import com.kumanoit.designpatterns.strategy.third.interfaces.FlyBehaviour;
import com.kumanoit.designpatterns.strategy.third.interfaces.QuackBehaviour;

public class RedheadDuck extends Duck implements FlyBehaviour, QuackBehaviour {

    @Override
    public void display() {
        System.out.println("Looks like a Redhead duck");
    }

    @Override
    public void fly() {
        System.out.println("Redhead duck flies");
    }

    @Override
    public void quack() {
        System.out.println("Readhead duck quacks");
    }

}
