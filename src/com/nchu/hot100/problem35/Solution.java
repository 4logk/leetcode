package com.nchu.hot100.problem35;

import com.nchu.hot100.problem6.ListNode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
/*    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode ans = null;
        while(head != null) {
            if(!set.contains(head)) {
                set.add(head);
            } else {
                ans = head;
                break;
            }
            head = head.next;

        }
        return ans;
    }*/
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while(fast != null) {
            slow = slow.next;
            if(fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if(slow == fast) {
                ListNode ptr = head;
                while(ptr != slow) {
                    slow = slow.next;
                    ptr = ptr.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
