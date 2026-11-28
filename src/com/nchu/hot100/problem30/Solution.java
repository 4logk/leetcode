package com.nchu.hot100.problem30;

class Solution {
/*    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] newNums = new int[length];
        for(int i = 0;i < length;i++) {
            newNums[(i + k) % length] = nums[i];
        }
        System.arraycopy(newNums, 0, nums, 0, length);
    }*/

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(0,length - 1,nums);
        reverse(0,k - 1,nums);
        reverse(k,length - 1,nums);
    }
    public void reverse(int left,int right,int[] nums) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
