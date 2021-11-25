//https://www.interviewbit.com/problems/step-by-step/

public class Solution {
    public int solve(int A) {
        int t = Math.abs(A);
        if(t==0) {
          return 0;
        }
        int sum = 0, steps = 0;
        while(sum<t){       
            sum+=steps;
            steps++;
        }
        while((sum-t)%2==1){
            sum+=steps;
            steps++;
        }
        return steps-1;
    }
}
