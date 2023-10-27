package org.programmers.stackqueue;

import java.util.Stack;

/**
 * 프로그래머스 스택  큐 올바른 괄호
 *
 * 효율성 테스트2에 걸림..
 *
 * */
public class StackQueue4 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        StackQueue4 st = new StackQueue4();

        String s = "()()";
        String s1 = "(())()";
        String s2 = ")()(";
        String s3 = "(()(";
        System.out.println(st.solution(s));

        System.out.println(st.solution(s1));

        System.out.println(st.solution(s2));
        System.out.println(st.solution(s3));
    }
}
