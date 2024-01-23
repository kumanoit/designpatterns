package com.kumanoit.designpatterns.strategy.fourth.impl;

import com.kumanoit.designpatterns.strategy.fourth.interfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with rocket power");
    }
}
