package com.nchu.hot100.problem36;

import com.nchu.hot100.problem6.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(9);
        node1.next = node2;
        Solution solution = new Solution();
        solution.addTwoNumbers(node1,node1);
    }
}
