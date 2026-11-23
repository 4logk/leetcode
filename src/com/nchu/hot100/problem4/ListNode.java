package com.nchu.hot100.problem4;



  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode newHead = head;
        head = head.next;
        newHead.next = null;
        while(head != null) {
            ListNode p = head;
            head = head.next;
            p.next = newHead;
            newHead = p;
        }
        return newHead;
    }
}
