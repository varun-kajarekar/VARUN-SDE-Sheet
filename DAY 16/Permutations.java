// https://www.interviewbit.com/problems/permutations/


public class Solution {
    int[][] d;
    int n, x;
    
    void play(int l, int r, int[] a){
        int i, j;
        if(l == r){
            for(i = 0; i < n; i++)  d[x][i] = a[i];
            x++;
            return;
        }
        for(i = l; i <= r; i++){
            j = a[i];
            a[i] = a[l];
            a[l] = j;
            play(l+1, r, a);
            j = a[i];
            a[i] = a[l];
            a[l] = j;
        }
    }
    
    public int[][] permute(int[] a) {
        n = a.length;
        x = 1;
        for(int i = 2; i <= n; i++){
            x *= i;
        }
        d = new int[x][n];
        x = 0;
        play(0, n-1, a);
        return d;
    }
}
