//https://www.interviewbit.com/problems/max-distance/



// O(n^2)
//TLE 
public class Solution {
    public int maximumGap(final int[] A) {
        int out = 0;
        for(int i =0;i<A.length-1;i++){
            for(int j =i+1;j<A.length;j++){
                if(A[i]<=A[j]){
                    if(j-i>out){
                        out = j-i;
                    }
                }
            }
        }
        return out;
    }
 
}






// main solution;

public class Solution {
    public int maximumGap(final int[] A) {
        int n = A.length;
        int[] leftMin = new int[n];
    leftMin[0] = A[0];
    for(int i = 1 ; i<n; i++)
        leftMin[i] = Math.min(leftMin[i-1], A[i]); 
 
    int maxDist = Integer.MIN_VALUE;
    int i = n-1, j = n-1;
 
    while(i>=0  &&  j>=0)
    {
        if(A[j] >= leftMin[i])
        {
            maxDist = Math.max(maxDist, j-i);
            i--;
        }
        else
            j--;
    }
 
    return maxDist;
    }
}
