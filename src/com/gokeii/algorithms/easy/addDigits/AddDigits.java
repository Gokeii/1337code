/******************************************************************************
 * 10 1
 * 11 2
 * 12 3
 * ...
 * 37 1
 * 38 2
 * 39 3
 * 40 4
 * ...
 * 
 * Result is n mod 9.
 ******************************************************************************/

package com.gokeii.algorithms.easy.addDigits;

public class AddDigits {
	public int addDigits(int num) {
		return num % 9;
	}
}
