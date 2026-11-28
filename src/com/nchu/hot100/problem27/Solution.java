package com.nchu.hot100.problem27;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0,preSum = 0;
        map.put(0,1);
        for(int i = 0;i < nums.length;i++) {
            preSum += nums[i];
            if(map.containsKey(preSum - k)) {
                ans += map.get(preSum - k);
            }
            map.put(preSum,map.getOrDefault(preSum,0) + 1);
        }
        return ans;
    }
}
