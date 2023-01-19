package com.kumanoit.designpatterns.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SynchronizedSingletonTest {

    @Test
    public void test() {
        final SynchronizedSingleton instance1 = SynchronizedSingleton.getInstance();
        final SynchronizedSingleton instance2 = SynchronizedSingleton.getInstance();
        Assert.assertEquals(instance1, instance2, "Two different instances are created");
    }
}
