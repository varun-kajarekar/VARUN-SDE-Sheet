// https://www.interviewbit.com/problems/reverse-string/



import java.util.*;
public class Solution {
    public String reverseString(String A) {
        Stack<Character> stk= new Stack<>();
        for(int i =0;i<A.length();i++){
            stk.push(A.charAt(i));
            }
        StringBuilder a1 = new StringBuilder();
        for(int i =0;i<A.length();i++){
            a1.append(stk.pop());
        }
        String a = a1.toString();
        return a;
    }
}
