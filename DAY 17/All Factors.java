//https://www.interviewbit.com/problems/all-factor



public class Solution {
    public int[] allFactors(int n) {
        int[] arr = new int[n];
        int j =0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i){
                    arr[j] = i;
                    j++;
                }
                else {
                    arr[j] = i;
                    j++;
                    arr[j] = n/i;
                    j++;
                }
            }
        }
        int[] out = new int[j];
        for(int i=0;i<j;i++){
            out[i] = arr[i];
        }
        Arrays.sort(out);
        return out;

    }
}
