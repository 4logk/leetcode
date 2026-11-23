package com.nchu.hot100.problem6;



import java.util.HashMap;


public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        while(head != null) {
            if(map.containsKey(head)) {
                    return true;
            }
            map.put(head,head.val);
            head = head.next;
        }
        return false;
    }
}