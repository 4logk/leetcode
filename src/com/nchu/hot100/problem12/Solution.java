package com.nchu.hot100.problem12;

import com.nchu.hot100.problem8.TreeNode;

import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        int res = depth(root);
        ans = Math.max(ans,res);
        return ans - 1;
    }
    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int L = depth(root.left);
        int R = depth(root.right);
        ans = Math.max(L + R + 1,ans);
        return Math.max(L,R) + 1;
    }
}