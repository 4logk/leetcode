package com.nchu.hot100.problem2;

class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length,right = 0,left = 0;
        while(right < length) {
            if(nums[right] != 0) {
                swap(nums,right,left);
                left++;
            }
            right++;
        }
    }
    public void swap(int[] nums,int right,int left) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
}

