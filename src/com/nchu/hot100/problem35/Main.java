package com.nchu.hot100.problem35;

import com.nchu.hot100.problem6.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;
        Solution solution = new Solution();
        solution.detectCycle(node1);
    }
}
