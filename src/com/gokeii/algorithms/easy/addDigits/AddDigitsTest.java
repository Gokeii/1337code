package com.gokeii.algorithms.easy.addDigits;

import org.junit.Test;

public class AddDigitsTest {

	@Test
	public void test() {
		AddDigits solution = new AddDigits();
		assert solution.addDigits(10) == 1;
		assert solution.addDigits(11) == 2;
		assert solution.addDigits(12) == 3;
		assert solution.addDigits(38) == 2;
		assert solution.addDigits(148) == 4;
	}

}
