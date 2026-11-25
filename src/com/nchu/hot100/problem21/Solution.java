package com.nchu.hot100.problem21;

import java.util.*;

class Solution {
/*    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);
            if (!map.containsKey(s)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(s, list);
            } else {
                List<String> list = map.get(s);
                list.add(str);
            }

        }
        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        for(Map.Entry<String,List<String>> temp : entries) {
            ans.add(temp.getValue());
        }
        return ans;
    }*/
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            List<String> value = map.getOrDefault(key, new ArrayList<String>());
            value.add(str);
            map.put(key, value);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
