package com.nchu.hot100.problem37;

import com.nchu.hot100.problem8.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
/*        public List<List<Integer>> levelOrder(TreeNode root) {
            ArrayList<List<Integer>> ans = new ArrayList<>();
            LinkedList<TreeNode> queue = new LinkedList<>();
            if(root == null) {
                return ans;
            }
            queue.offer(root);
            help(ans,queue);
            return ans;
        }
        public void help(List<List<Integer>> ans,LinkedList<TreeNode> queue) {
            if(queue.isEmpty()) {
                return;
            }
            LinkedList<TreeNode> newQueue = new LinkedList<>();;
            ArrayList<Integer> integers = new ArrayList<>();
            while(!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    newQueue.offer(node.left);
                }
                if(node.right != null) {
                    newQueue.offer(node.right);
                }
                integers.add(node.val);
            }
            if(!integers.isEmpty()) {
                ans.add(integers);
            }
            help(ans,newQueue);
        }*/
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            ArrayList<Integer> integers = new ArrayList<>();
            int size = queue.size();
            for(int i = 0;i < size;i++) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
                integers.add(node.val);
            }
            ans.add(integers);
        }
        return ans;
    }
    }

