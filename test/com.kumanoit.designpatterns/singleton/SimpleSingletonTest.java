package com.kumanoit.designpatterns.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleSingletonTest {
    @Test
    public void test() {
        final SimpleSingleton instance1 = SimpleSingleton.getInstance();
        final SimpleSingleton instance2 = SimpleSingleton.getInstance();
        Assert.assertEquals(instance1, instance2, "Two different instances are created");
    }
}
