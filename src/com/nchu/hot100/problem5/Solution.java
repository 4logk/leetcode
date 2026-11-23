package com.nchu.hot100.problem5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;


/*        stack.getLast() //查看栈顶
        stack.offerLast() //压入栈
        stack.pollLast() //出栈
        */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array = new ArrayList<>();
        while(head != null) {
            array.add(head.val);
            head = head.next;
        }
        int front = 0;
        int end = array.size() - 1;
        while(front < end) {
            if(!Objects.equals(array.get(front), array.get(end))) {
                return false;
            }
            front++;
            end--;
        }
        return true;

    }
}