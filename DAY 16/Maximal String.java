// https://www.interviewbit.com/problems/maximal-string/


public class Solution {
    String max;
    public String solve(String A, int k) {
        max = A;
        helper(A,k,0);
        return max;
    }
    
    public void helper(String S, int k , int cur) {
        if(k == 0 )
            return;
        int n = S.length();
        char maxChar = S.charAt(cur);
        for(int i = cur+1; i < n ; i++)
        {
            if(S.charAt(i) > maxChar)
                maxChar = S.charAt(i);
        }
        if(maxChar != S.charAt(cur))
            k--;
        for(int j = cur; j < n ; j++)
        {
            if(S.charAt(j) == maxChar)
            {
                char[] ss = S.toCharArray();
                char temp = ss[cur];
                ss[cur] = ss[j];
                ss[j] = temp;
                String swapped = new String(ss);
                if(swapped.compareTo(max) > 0)
                    max = swapped;
                helper(swapped, k , cur+1);
                
            }
        }
        
    }
}
