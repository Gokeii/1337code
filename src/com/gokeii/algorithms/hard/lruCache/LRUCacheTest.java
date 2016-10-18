package com.gokeii.algorithms.hard.lruCache;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void test() {
        LRUCache solution = new LRUCache(3);

        solution.set(1, 1);
        solution.set(2, 2);
        solution.set(3, 3);
        solution.set(4, 4);

        Assert.assertEquals(-1, solution.get(1));
        Assert.assertEquals(2, solution.get(2));
        Assert.assertEquals(3, solution.get(3));
        Assert.assertEquals(4, solution.get(4));
    }

}
