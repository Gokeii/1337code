package com.gokeii.algorithms.easy.nimGame;

import org.junit.Test;

public class NimGameTest {

	@Test
	public void test() {
		NimGame solution = new NimGame();
		assert solution.canWinNim(1);
		assert solution.canWinNim(2);
		assert solution.canWinNim(3);
		assert !solution.canWinNim(4);
		assert solution.canWinNim(5);
		assert solution.canWinNim(6);
		assert solution.canWinNim(7);
		assert !solution.canWinNim(8);
	}

}
