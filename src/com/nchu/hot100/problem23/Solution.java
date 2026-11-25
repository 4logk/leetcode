package com.nchu.hot100.problem23;

class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length - 1,ans = 0;
        while(left < right) {
            int h = Math.min(height[left],height[right]);
            ans = Math.max(ans,h * (right - left));
            if(h == height[left]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
