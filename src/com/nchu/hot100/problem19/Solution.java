package com.nchu.hot100.problem19;

import java.util.Arrays;

class Solution {
/*    public int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int result = nums[0];
        Arrays.sort(nums);
        if(nums[0] != nums[1]) {
            return nums[0];
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        for(int i = 1;i < nums.length - 1;i++) {
            if(nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                result = nums[i];
            }
        }
        return result;
    }*/
        public int singleNumber(int[] nums) {
            int ans = 0;
            for (int num : nums) {
                ans ^= num;
            }
            return ans;
    }
}