package com.kumanoit.designpatterns.strategy.fourth.impl;

import com.kumanoit.designpatterns.strategy.fourth.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("quack quack");
    }

}
