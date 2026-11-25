package com.nchu.hot100.problem17;

class Solution {
    public int climbStairs(int n) {
        int f1 = 2,f2= 1,res = 0;
        for(int i = 3; i < n;i++) {
            res = f1 + f2;
            f2 = f1;
            f1 = res;
        }
        res = f1 + f2;
        if(n == 1){
            return f2;
        }
        if(n == 2) {
            return f1;
        }
        return res;
    }
}
