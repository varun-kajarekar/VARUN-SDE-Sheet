// https://www.interviewbit.com/problems/reverse-integer/

public class Solution {
    public int reverse(int A) {
        long reverse = 0;
        int sign = A >= 0 ? 1 : -1;
        A = Math.abs(A);
        while (A > 0) {
            reverse = reverse * 10 + A % 10;
            A /= 10;
        }
        reverse *= sign;
        return reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ? 0 : (int)reverse;
    }
}
