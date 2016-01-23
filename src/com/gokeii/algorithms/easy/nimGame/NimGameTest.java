package com.gokeii.algorithms.easy.nimGame;

import org.junit.Assert;
import org.junit.Test;

public class NimGameTest {

    @Test
    public void test() {
        NimGame solution = new NimGame();
        Assert.assertEquals(true, solution.canWinNim(1));
        Assert.assertEquals(true, solution.canWinNim(2));
        Assert.assertEquals(true, solution.canWinNim(3));
        Assert.assertEquals(false, solution.canWinNim(4));
        Assert.assertEquals(true, solution.canWinNim(5));
        Assert.assertEquals(true, solution.canWinNim(6));
        Assert.assertEquals(true, solution.canWinNim(7));
        Assert.assertEquals(false, solution.canWinNim(8));
    }

}
