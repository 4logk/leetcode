package com.nchu.hot100.problem20;

import java.util.HashMap;
import java.util.Set;

class Solution {
/*    public int majorityElement(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            Integer value = map.get(nums[i]);
            if(value == null) {
                map.put(nums[i],1);
            } else {
                value += 1;
                map.put(nums[i],value);
            }
        }
        Object[] array = map.keySet().toArray();
        for(int i = 0;i < array.length;i++) {
            Integer value = map.get(array[i]);
            if(value > nums.length / 2) {
                ans = (int) array[i];
            }
        }
        return ans;
    }*/
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candicate = null;
        for (int num : nums) {
            if (count == 0) {
                candicate = num;
            }
            count = (candicate == num) ? count + 1 : count - 1;
        }
        return candicate;
    }
}