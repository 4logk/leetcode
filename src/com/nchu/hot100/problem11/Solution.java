package com.nchu.hot100.problem11;


import com.nchu.hot100.problem6.ListNode;
import com.nchu.hot100.problem8.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
    public boolean check(TreeNode left,TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null) {
            return false;
        }
        if(right == null) {
            return false;
        }
        return left.val == right.val && check(left.right,right.left) && check(left.left,right.right);
    }
}
