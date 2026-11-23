package com.nchu.hot100.problem3;




public class Solution {
/*    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        while(p != null) {
            ListNode q = headB;
            while(q != null) {
                if(q == p) {
                    return q;
                }
                q = q.next;
            }
            p = p.next;
        }
        return null;
    }*/
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode A = headA,B = headB;
    while(A != B) {
        A = A != null ? A.next : headB;
        B = B != null ? B.next : headA;
    }
    return A;
}
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
