// https://www.interviewbit.com/problems/pick-from-both-sides/

public class Solution {
    public int solve(int[] A, int B) {
        int ans = 0, temp = 0;
        for(int i = 0; i<B; i++){
            ans = ans + A[i];
        }
        temp = ans;
        for(int i = 0; i<B; i++){
            temp = temp - A[B-i-1] + A[A.length-i-1];
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}
