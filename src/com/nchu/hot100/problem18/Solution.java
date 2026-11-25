package com.nchu.hot100.problem18;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < numRows;i++) {
            ArrayList<Integer> integers = new ArrayList<>();
            for(int j = 0;j < i + 1;j++) {
                if(j == 0) {
                    integers.add(1);
                    continue;
                } else if(j == i) {
                    integers.add(1);
                    continue;
                }
                List<Integer> row = res.get(i - 1);
                integers.add(row.get(j - 1) + row.get(j));
            }
            res.add(integers);
        }
        return res;
    }
}