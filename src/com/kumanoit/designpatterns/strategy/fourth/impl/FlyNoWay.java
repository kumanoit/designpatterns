package com.kumanoit.designpatterns.strategy.fourth.impl;

import com.kumanoit.designpatterns.strategy.fourth.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour  {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
