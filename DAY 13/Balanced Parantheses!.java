// https://www.interviewbit.com/problems/balanced-parantheses/


public class Solution {
    public int solve(String A) {
        Stack<Character> stack = new Stack<>();
        for(char c: A.toCharArray()) {
            if(c == ')') {
                if(stack.isEmpty() || stack.peek() == ')') {
                    return 0;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        if(stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}
