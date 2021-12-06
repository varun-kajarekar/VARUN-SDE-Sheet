// https://www.interviewbit.com/problems/single-number/


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int[] B = new int[A.length];
        for(int i=0 ;i<A.length;i++){
            B[i] = A[i];
        }
        int out = 0;
        Arrays.sort(B);
        if(A.length == 1){
            return B[0];
        }
        for(int i=0 ;i<B.length-1;i++){
            if(B[i]!=B[i+1]){
                return B[i];
            }
            i++;
        }
        return B[B.length-1];
    }
}
