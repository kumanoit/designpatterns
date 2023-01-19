package com.kumanoit.designpatterns.simple.fourth.impl;

import com.kumanoit.designpatterns.simple.fourth.interfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with rocket power");
    }
}
