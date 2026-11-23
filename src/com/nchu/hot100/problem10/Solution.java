package com.nchu.hot100.problem10;

import com.nchu.hot100.problem8.TreeNode;

import java.util.LinkedList;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        invertTree(root.right);
        invertTree(root.left);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
