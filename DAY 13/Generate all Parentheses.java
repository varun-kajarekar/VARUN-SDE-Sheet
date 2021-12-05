// https://www.interviewbit.com/problems/generate-all-parentheses/




public class Solution {

    public int isValid(String S) {

        Stack<Character> A = new Stack<Character>();

        int n = S.length();

        int i = 0;

        while(i<n){

                if(A.isEmpty()) A.push(S.charAt(i));

                else if(A.peek()=='(' && S.charAt(i)==')') A.pop();

                else if(A.peek() == '[' && S.charAt(i) == ']') A.pop();

                else if(A.peek() == '{' && S.charAt(i) == '}') A.pop();

                else if(A.peek()=='(' && (S.charAt(i)==']' || S.charAt(i) == '}')) return 0;

                else if(A.peek()=='{' && (S.charAt(i)==']' || S.charAt(i) == ')')) return 0;

                else if(A.peek()=='[' && (S.charAt(i)==')' || S.charAt(i) == '}')) return 0;

                else A.push(S.charAt(i));

            i++;

        }

        if(A.isEmpty())

            return 1;

        else

            return 0;

    }

}



