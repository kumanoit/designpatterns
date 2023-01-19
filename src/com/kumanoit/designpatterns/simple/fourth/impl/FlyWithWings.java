package com.kumanoit.designpatterns.simple.fourth.impl;

import com.kumanoit.designpatterns.simple.fourth.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
