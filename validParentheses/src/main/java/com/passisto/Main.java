package com.passisto;

import java.util.Stack;

public class Main {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ')':
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    }else {
                        stack.push(')');
                    }
                    break;
                case '}':
                    if (!stack.empty() && stack.peek() == '{') {
                        stack.pop();
                    }else {
                        stack.push('}');
                    }
                    break;
                case ']':
                    if (!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    }else {
                        stack.push(']');
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        System.out.println(isValid("(]{}"));
    }
}