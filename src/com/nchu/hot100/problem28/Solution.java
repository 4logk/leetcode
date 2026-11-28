package com.nchu.hot100.problem28;

class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length,ans = nums[0],pre = 0;
        for(int x : nums) {
            pre += x;
            pre = Math.max(pre,x);
            ans = Math.max(pre,ans);
        }
        return ans;
    }
}
