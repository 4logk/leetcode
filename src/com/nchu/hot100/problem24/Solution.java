package com.nchu.hot100.problem24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int first = 0;first < length;first++) {
            if(first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int target = -nums[first];
            int third = length - 1;
            for(int second = first + 1;second < length;second++) {
                if(second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                while (nums[third] + nums[second] > target && third > second) {
                    third--;
                }
                if(third == second) {
                    break;
                }
                if(nums[third] + nums[second] == target) {
                    ArrayList<Integer> three = new ArrayList<>();
                    three.add(nums[first]);
                    three.add(nums[second]);
                    three.add(nums[third]);
                    ans.add(three);
                }
            }
        }

        return ans;
    }
}
