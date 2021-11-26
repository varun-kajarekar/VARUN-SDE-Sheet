//https://www.interviewbit.com/problems/array-sum/

public class Solution {
    public int[] addArrays(int[] A, int[] B) {
        
        int n = A.length;
        int m = B.length;
        if (n >= m)
            return sum(A, B, n, m);
        else
            return sum(B, A, m, n);
    } 
    public int[] sum(int[] A, int[] B, int n, int m){
        ArrayList<Integer>l1 = new ArrayList<>();
        int i = n - 1, j = m - 1;
        int carry = 0, s = 0;
        while (j >= 0) {
            s = A[i] + B[j] + carry;
            l1.add(s % 10);
            carry = s / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            s = A[i] + carry;
            l1.add(s % 10);
            carry = s / 10;
            i--;
        }
        if (carry>0){
            l1.add(carry);
        }
        int[]ans = new int[l1.size()];
        for(i = 0; i < l1.size(); i++){
            ans[i] = l1.get(l1.size() - i - 1);
        }
        return ans;
    }

}
