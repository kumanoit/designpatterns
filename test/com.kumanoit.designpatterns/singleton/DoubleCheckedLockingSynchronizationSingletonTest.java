package com.kumanoit.designpatterns.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleCheckedLockingSynchronizationSingletonTest {

    @Test
    public void testDoubleInstance() {
        final DoubleCheckedLockingSynchronizationSingleton instance1 = DoubleCheckedLockingSynchronizationSingleton.getInstance();
        final DoubleCheckedLockingSynchronizationSingleton instance2 = DoubleCheckedLockingSynchronizationSingleton.getInstance();
        Assert.assertEquals(instance1, instance2, "Two different instances are created");
    }
}
