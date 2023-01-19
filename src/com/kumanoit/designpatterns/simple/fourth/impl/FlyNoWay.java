package com.kumanoit.designpatterns.simple.fourth.impl;

import com.kumanoit.designpatterns.simple.fourth.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour  {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
