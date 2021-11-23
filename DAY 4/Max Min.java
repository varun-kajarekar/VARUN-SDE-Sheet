// https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/

public class Solution {
    public int solve(int[] A) {
        int cur = 0;
        int final_min = A[0];
        for(int i=1;i<A.length;i++){
            cur = A[i];
            if(cur<final_min) final_min =cur;
        }
        int cur1 = 0;
        int final_min1 = A[0];
        for(int i=1;i<A.length;i++){
            cur1 = A[i];
            if(cur1>final_min1) final_min1 =cur1;
        }
        return final_min+final_min1;
    }
}


// or simple use sort fun. and return addition.
