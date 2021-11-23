//https://www.interviewbit.com/problems/minimum-lights-to-activate/

public class Solution {
    public int solve(int[] A, int B) {
        
        int n =A.length;
        int count=0;
        int i=0;
        while(i<n)
        {
            boolean found=false;
            int l = Math.max(0,i-B+1);
            int r = Math.min(n-1,i+B-1);
            
            for(int k=r;k>=l;k--)
            {
                if(A[k]==1)
                {
                    i=k+B;
                    found=true;
                    count++;
                    break;
                }
            }
            if(!found){return -1;}
            
        }
        
        return count;
        
    }
}
