// https://www.interviewbit.com/problems/noble-integer/

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        for(int i=0; i<A.length; i++)
        {
            while(i<A.length-1 && A[i] == A[i+1])
                i++;
            if(A[i] == A.length - i - 1)
                return 1;
        }
        return -1;
    }
}
