package com.nchu.hot100.problem26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
/*    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        char[] pCharArray = p.toCharArray();
        Arrays.sort(pCharArray);
        p = new String(pCharArray);
        char[] sCharArray = s.toCharArray();
        int left = 0,sLength = s.length(),pLength = p.length();
        while(left + pLength <= sLength) {
            int right = left;
            char[] temp = new char[pLength];
            while(right - left < pLength) {
                temp[right - left] = sCharArray[right];
                right++;
            }
            Arrays.sort(temp);
            String tempStr = new String(temp);
            if(tempStr.equals(p)) {
                ans.add(left);
            }
            left++;
        }
        return ans;
    }*/

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sLength = s.length();
        int pLength = p.length();
        if(sLength < pLength) {
            return new ArrayList<Integer>();
        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for(int i = 0;i < pLength;i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sCount,pCount)) {
            ans.add(0);
        }
        for(int i = 0;i < sLength - pLength;i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + pLength) - 'a']++;
            if(Arrays.equals(sCount,pCount)) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
