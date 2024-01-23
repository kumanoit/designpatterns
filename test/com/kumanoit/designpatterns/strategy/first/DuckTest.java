package com.kumanoit.designpatterns.strategy.first;

import org.testng.annotations.Test;

public class DuckTest {

    @Test
    public void testMallard() {
        final Duck duck = new MallardDuck();
        duck.quack();
        duck.display();
        duck.swim();
    }

    @Test
    public void testRedHead() {
        final Duck duck = new RedheadDuck();
        duck.quack();
        duck.display();
        duck.swim();
    }
}
