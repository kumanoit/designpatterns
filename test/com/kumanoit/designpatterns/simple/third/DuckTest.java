package com.kumanoit.designpatterns.simple.third;

import org.testng.annotations.Test;

/**
 * In the second iteration when a fly behaviour had to be added to all
 * ducks, a fly method was added in base class Duck. Due to this, all
 * subclasses inherited it which lead to even rubber duck flying.
 *
 * To prevent this, flyBehaviour and quackBehaviour interfaces were created.
 * These were implemented by each of duck class implementation. This
 * prevented rubber duck to fly.
 *
 * However, it is not an extensible solution. There will be many common
 * behaviour like there can be multiple ducks which might be flying and
 * quacking in same way. Having it an interface, demands every subclass to
 * inherit and implement the behaviour. This leads to duplication of code.
 */
public class DuckTest {

    @Test
    public void testMallard() {
        final MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();
    }

    @Test
    public void testRedHead() {
        final RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.fly();
    }


    @Test
    public void testRubberDuck() {
        final RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();
    }
}
