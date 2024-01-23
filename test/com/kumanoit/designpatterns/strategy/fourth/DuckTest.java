package com.kumanoit.designpatterns.strategy.fourth;

import org.testng.annotations.Test;

public class DuckTest {

    @Test
    public void testMallardDuck() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();
    }

    @Test
    public void testRedHeadDuck() {
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.swim();
        redheadDuck.performFly();
    }

    @Test
    public void testRubberDuck() {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();
    }
}
