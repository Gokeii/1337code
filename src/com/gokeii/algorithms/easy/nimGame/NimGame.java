package com.gokeii.algorithms.easy.nimGame;

public class NimGame {
	public boolean canWinNim(int n) {
        return !(n % 4 == 0);
    }
}
