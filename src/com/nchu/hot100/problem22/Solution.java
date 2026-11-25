package com.nchu.hot100.problem22;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
/*    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int ans = 1,temp = 1;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 1;i++) {
            if(nums[i + 1] - nums[i] == 1) {
                temp++;
            } else if(nums[i + 1] - nums[i] == 0) {
            } else {
                temp = 1;
            }
            ans = Math.max(ans,temp);
        }
        return ans;
    }*/
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int longest = 0,current;
        for(int num : set) {
            if(!set.contains(num - 1)) {
                current = 1;
                while(set.contains(num + 1)) {
                    num += 1;
                    current += 1;
                }
                longest = Math.max(current,longest);
            }
        }
        return longest;
    }
}
