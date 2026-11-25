package com.nchu.hot100.problem15;

import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : charArray) {
            if (stack.isEmpty()) {
                stack.offerLast(c);
                continue;
            }
            if (stack.getLast() == '(' && c == ')') {
                stack.pollLast();
            } else if (stack.getLast() == '[' && c == ']') {
                stack.pollLast();
            } else if (stack.getLast() == '{' && c == '}') {
                stack.pollLast();
            }
            else {
                stack.offerLast(c);
            }
        }
        return stack.isEmpty();
    }
}
