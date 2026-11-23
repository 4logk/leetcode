package com.nchu.hot100.problem5;

public class Main {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(a));

    }
}
