package com.kumanoit.designpatterns.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LazyLoadedSingletonTest {

    @Test
    public void test() {
        final LazyLoadedSingleton instance1 = LazyLoadedSingleton.getInstance();
        final LazyLoadedSingleton instance2 = LazyLoadedSingleton.getInstance();
        Assert.assertEquals(instance1, instance2, "Two different instances are created");
    }
}
