package com.nchu.hot100.problem14;

class Solution {
/*    public int searchInsert(int[] nums, int target) {
        for(int i = 0;i < nums.length - 1;i++) {
            if(target == nums[i]) {
                return i;
            }
            if(target == nums[i + 1]) {
                return i + 1;
            }
            if(target > nums[i] && target < nums[i + 1]) {
                return i + 1;
            }
        }
        return target > nums[0] ? nums.length : 0;
    }*/
        public int searchInsert(int[] nums, int target) {
            int length = nums.length;
            int right = length - 1,left = 0,ans = length;
            while(right >= left) {
                int mid = ((right - left) >> 1) + left;
                if(target <= nums[mid]) {
                    right = mid - 1;
                    ans = mid;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
    }
}
