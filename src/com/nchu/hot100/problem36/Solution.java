package com.nchu.hot100.problem36;

import com.nchu.hot100.problem6.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            if(head == null) {
                head = tail = new ListNode((num1 + num2 + carry) % 10);
            } else {
                tail.next = new ListNode((num1 + num2 + carry) % 10);
                tail = tail.next;
            }
            carry = (num1 + num2 + carry) / 10;
            if(carry != 0) {
                tail.next = new ListNode(carry);
            }
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
         }
        return head;
    }
}
