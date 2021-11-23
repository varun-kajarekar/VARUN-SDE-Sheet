// https://www.interviewbit.com/problems/find-duplicate-in-array/


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        for (int i = 0; i < A.length; i++) {
        int abs1=Math.abs(A[i]);
        if(A[abs1]>=0){
            A[abs1]=-A[abs1];
        }
        else return abs1;
    }
    return -1;
    }
}
