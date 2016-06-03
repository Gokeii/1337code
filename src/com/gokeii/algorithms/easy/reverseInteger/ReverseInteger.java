/******************************************************************************
 * kinda like high precision
 ******************************************************************************/

package com.gokeii.algorithms.easy.reverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            reversed *= 10;
            reversed += x % 10;
            x /= 10;
        }
        
        return reversed;
    }
}
