// https://www.interviewbit.com/problems/trailing-zeroes/


public class Solution {
    public int solve(int A) {
        int zeros = 0;
        int rem =0;
        while(A>0){
            rem = A%2;
            A = A/2;
            if(rem==0){
                zeros++;
            }
            else{
                A=0;
            }
        }
        return zeros;
    }
}
