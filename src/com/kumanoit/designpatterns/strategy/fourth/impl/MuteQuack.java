package com.kumanoit.designpatterns.strategy.fourth.impl;

import com.kumanoit.designpatterns.strategy.fourth.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
