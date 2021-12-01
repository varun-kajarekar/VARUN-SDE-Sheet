// https://www.interviewbit.com/problems/reverse-bits/


public class Solution {
	public long reverse(long a) {
        long rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = (rev << 1) | (a & 1);
            a >>= 1;
        }
        return rev;
    }
}
