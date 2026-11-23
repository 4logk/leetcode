package com.nchu.hot100.problem9;


import com.nchu.hot100.problem8.TreeNode;

import java.util.LinkedList;

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int ans = 0;
        ans = Math.max(maxDepth(root.left),ans);
        ans = Math.max(maxDepth(root.right),ans);
        ans += 1;
        return ans;
    }
}
