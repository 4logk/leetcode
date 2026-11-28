package com.nchu.hot100.problem33;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0,bottom = matrix.length - 1,left = 0,right = matrix[0].length - 1;
        while(top <= bottom && left <= right) {
            for(int i = left;i <= right;i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i <= bottom;i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            for(int i = right;i >= left;i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom;i >= top;i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}
