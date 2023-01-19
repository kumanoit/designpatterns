package com.kumanoit.designpatterns.simple.fourth.impl;

import com.kumanoit.designpatterns.simple.fourth.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("quack quack");
    }

}
