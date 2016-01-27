/******************************************************************************
 * Sort and check if any two element equal.
 * Quick sort 1 may cause stack overflow (the worst scenario of quick sort). 
 * So here I use quick sort 2. 
 ******************************************************************************/

package com.gokeii.algorithms.easy.containsDuplicate;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        quickSort2(0, nums.length - 1, nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    private void quickSort1(int l, int r, int[] nums) {
        if (l >= r) return;

        System.out.println(l + " " + r);
        int i = l, j = r;
        int key = nums[l];
        
        while (i < j) {
            while (nums[j] >= key && i < j) j--;
            nums[i] = nums[j];
            while (nums[i] <= key && i < j) i++;
            nums[j] = nums[i];
        }
        nums[i] = key;
        
        quickSort1(l, i - 1, nums);
        quickSort1(i + 1, r, nums);
    }
    
    private void quickSort2(int l, int r, int[] nums) {
        if (l >= r) return;

        int i = l, j = r;
        int key = nums[(l + r) / 2];
        
        while (i <= j) {
            while (nums[i] < key && i <= j) i++;
            while (nums[j] > key && i <= j) j--;
            
            if (i <= j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j--;
            }
        }

        quickSort2(l, j, nums);
        quickSort2(i, r, nums);
    }
}
