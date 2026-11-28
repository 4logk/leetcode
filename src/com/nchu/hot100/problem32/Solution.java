package com.nchu.hot100.problem32;

import java.util.ArrayList;

class Solution {
/*    public void setZeroes(int[][] matrix) {
        int length = matrix.length;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for(int i = 0;i < length;i++) {
            for(int j = 0;j < matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    if(!row.contains(i)) {
                        row.add(i);
                    }
                    if(!col.contains(j)) {
                        col.add(j);
                    }
                }
            }
        }
        for (Integer value : row) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[value][j] = 0;
            }
        }
        for (Integer integer : col) {
            for (int j = 0; j < length; j++) {
                matrix[j][integer] = 0;
            }
        }
    }*/
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                if(matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                if(row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
