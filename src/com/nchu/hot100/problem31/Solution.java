package com.nchu.hot100.problem31;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] newNums = new int[length];
        newNums[0] = 1;
        for(int i = 1;i < length;i++) {
            newNums[i] = newNums[i - 1] * nums[i - 1];
        }
        int R = 1;
        for(int i = length - 1;i >= 0;i--) {
            newNums[i] = newNums[i] * R;
            R *= nums[i];
        }
        return newNums;
    }
}