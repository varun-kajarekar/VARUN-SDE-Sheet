// https://www.interviewbit.com/problems/total-moves-for-bishop/

public class Solution {
    public int solve(int A, int B) {
        int one = Math.min(A-1,8-B);
        int two = Math.min(A-1,B-1);
        int threee =Math.min(8-A,B-1);
        int four =Math.min(8-A,8-B);
        return one+two+threee+four;
    }
}
