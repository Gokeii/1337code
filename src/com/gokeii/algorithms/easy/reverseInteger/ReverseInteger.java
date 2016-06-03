/******************************************************************************
 * kinda like high precision.
 * pay attention to integer overflow.
 ******************************************************************************/

package com.gokeii.algorithms.easy.reverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        int highMax = Integer.MAX_VALUE / 10;
        int lowMax = Integer.MAX_VALUE % 10;
        
        int reversed = 0;
        while (x != 0) {
            reversed *= 10;
            reversed += x % 10;
            x /= 10;
            
            int absX = Math.abs(x);
            if (absX < 10 && absX > 0) {
                int absReversed = Math.abs(reversed);
                if (absX > lowMax && absReversed == highMax
                        || absX <= lowMax && absReversed > highMax) {
                    return 0;
                }
            }
        }
        
        return reversed;
    }
}
