package com.nchu.hot100.problem29;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        int length = intervals.length;
        if(length == 0) {
            return new int[0][];
        }
        Arrays.sort(intervals,(int[] a,int[] b) -> a[0] - b[0] );
        ArrayList<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i = 1;i < length;i++) {
            int[] last = list.get(list.size() - 1);
            int[] cur = intervals[i];
            if(last[1] >= cur[0]) {
                last[1] = Math.max(last[1],cur[1]);
            } else {
                list.add(cur);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}