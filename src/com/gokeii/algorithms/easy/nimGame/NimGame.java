/******************************************************************************
 * 
 * If start number of stone is not a multiple of 4, I can always remove the
 * exact number of stones and make the resulting number of stones to be a 
 * multiple of 4.
 * In this way, when the number reduces to 4, it must be the turn of my opponent
 * to remove stone(s). Of course, I win.
 ******************************************************************************/

package com.gokeii.algorithms.easy.nimGame;

public class NimGame {
	public boolean canWinNim(int n) {
		return !(n % 4 == 0);
	}
}
