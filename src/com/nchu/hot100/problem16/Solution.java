package com.nchu.hot100.problem16;

class Solution {
/*    public int maxProfit(int[] prices) {
        int ans = 0;
        for(int i = 0;i < prices.length;i++) {
            for(int j = i + 1;j < prices.length;j++) {
                ans = Math.max(ans,prices[j] - prices[i]);
            }
        }
        return ans;
    }*/
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                ans = Math.max(ans, price - min);
            }
        }
        return ans;
    }
}
