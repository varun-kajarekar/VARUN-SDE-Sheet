//https://www.interviewbit.com/problems/largest-number/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        int out = A[0];
        for (int i = 0; i < A.length-1; i++) {
            out = Compre(out, A[i+1]);
        }
        String fout = String.valueOf(out);
        return fout;

    }
    public static int Compre(int a , int b){
        String sA = String.valueOf(a);
        String sB = String.valueOf(b);
        String out1 = sA+sB;
        String out2 = sB+sA;
        int o1 = Integer.parseInt(out1);
        int o2 = Integer.parseInt(out2);
        return Math.max(o1,o2);
    }
}
