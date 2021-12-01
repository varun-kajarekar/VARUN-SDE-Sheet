// https://www.interviewbit.com/problems/number-of-1-bits/

public class Solution {
    public int numSetBits(long a) {
        
        int count = 0;
        
        while (a != 0) {
            a &= a - 1;
            count++;
        }
        
        return count;            
    }
}
