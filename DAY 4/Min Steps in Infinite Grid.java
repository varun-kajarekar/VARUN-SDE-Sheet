// https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int res = 0;
        for (int i = 0; i < A.length - 1; i++) {
            res += Math.max(Math.abs(A[i] - A[i + 1]), Math.abs(B[i] - B[i + 1]));
        }
        return res;
    }
}
