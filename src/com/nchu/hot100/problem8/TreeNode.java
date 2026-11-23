package com.nchu.hot100.problem8;


import java.util.ArrayList;
import java.util.List;

public class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      public TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
    public void inorder(TreeNode root,List<Integer> ans) {
        if(root == null) {
            return;
        }
        if(root.left != null) {
            inorder(root.left,ans);
        }
        ans.add(root.val);
        if(root.right != null) {
            inorder(root.right,ans);
        }

    }
}
