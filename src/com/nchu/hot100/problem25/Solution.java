package com.nchu.hot100.problem25;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        char[] charArray = s.toCharArray();
        int right = -1,length = charArray.length;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i < length;i++) {
            if(i != 0) {
                set.remove(charArray[i - 1]);
            }
            while(right + 1 < length && !set.contains(charArray[right + 1])) {
                set.add(charArray[right + 1]);
                right++;
            }
            res = Math.max(right - i + 1,res);
        }
        return res;
    }
}
