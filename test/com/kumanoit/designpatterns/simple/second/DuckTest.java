package com.kumanoit.designpatterns.simple.second;

import org.testng.annotations.Test;

public class DuckTest {

    @Test
    public void testMallard() {
        final Duck duck = new MallardDuck();
        duck.quack();
        duck.display();
        duck.swim();
        duck.fly();
    }

    @Test
    public void testRedHead() {
        final Duck duck = new RedheadDuck();
        duck.quack();
        duck.display();
        duck.swim();
        duck.fly();
    }


    @Test
    public void testRubberDuck() {
        final Duck duck = new RubberDuck();
        duck.quack();
        duck.display();
        duck.swim();
        duck.fly();
    }
}
